package com.example.tolist_de_aprendizaje;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class RegisterActivity extends AppCompatActivity {

    // Definir variables
    public EditText inputNombre, inputEmail, inputTelefono, inputPassw1, inputConfirmPassw;
    public Button btnRegistrar;
    public TextView textMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Inicializar variables del layout
        inputNombre = findViewById(R.id.inputNombre);
        inputEmail = findViewById(R.id.inputEmail);
        inputTelefono = findViewById(R.id.inputTelefono);
        inputPassw1 = findViewById(R.id.inputPassw1);
        btnRegistrar = findViewById(R.id.btnRegistrar);
        textMessage = findViewById(R.id.textMessage);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Obtener los datos ingresados por el usuario
                String nombre = inputNombre.getText().toString().trim();
                String email = inputEmail.getText().toString().trim();
                String telefono = inputTelefono.getText().toString().trim();
                String password = inputPassw1.getText().toString().trim();

                // Validar campos
                if (!nombre.isEmpty() && !email.isEmpty() && !telefono.isEmpty() && !password.isEmpty()) {
                    // Llamar al método para realizar el registro
                    registrarUsuario(nombre, email, telefono, password);
                } else {
                    Toast.makeText(RegisterActivity.this, "Por favor, complete todos los campos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    // Método para registrar usuario en segundo plano usando un hilo
    private void registrarUsuario(final String nombre, final String email, final String telefono, final String password) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    // URL de tu archivo PHP para el registro
                    URL url = new URL("http://192.168.56.1/register.php");
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setDoOutput(true);

                    // Enviar datos al servidor
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));

                    String post_data = URLEncoder.encode("nombre", "UTF-8") + "=" + URLEncoder.encode(nombre, "UTF-8") + "&"
                            + URLEncoder.encode("email", "UTF-8") + "=" + URLEncoder.encode(email, "UTF-8") + "&"
                            + URLEncoder.encode("telefono", "UTF-8") + "=" + URLEncoder.encode(telefono, "UTF-8") + "&"
                            + URLEncoder.encode("password", "UTF-8") + "=" + URLEncoder.encode(password, "UTF-8");

                    bufferedWriter.write(post_data);
                    bufferedWriter.flush();
                    bufferedWriter.close();
                    outputStream.close();

                    // Obtener la respuesta del servidor
                    InputStream inputStream = httpURLConnection.getInputStream();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "iso-8859-1"));
                    final StringBuilder result = new StringBuilder();
                    String line;
                    while ((line = bufferedReader.readLine()) != null) {
                        result.append(line);
                    }

                    bufferedReader.close();
                    inputStream.close();
                    httpURLConnection.disconnect();

                    // Mostrar la respuesta en el hilo principal (UI Thread)
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            String serverResponse = result.toString().trim();
                            if (serverResponse.equals("success")) {
                                Toast.makeText(RegisterActivity.this, "Registro exitoso", Toast.LENGTH_LONG).show();

                                // Limpiar los campos de entrada
                                inputNombre.setText("");
                                inputEmail.setText("");
                                inputTelefono.setText("");
                                inputPassw1.setText("");
                                inputConfirmPassw.setText("");

                                // Retrasar la redirección al MainActivity por 3 segundos (3000 ms)
                                new Handler().postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                                        startActivity(intent);
                                        finish();
                                    }
                                }, 3000); // 3 segundos de retraso

                            } else if (serverResponse.equals("email_exists")) {
                                Toast.makeText(RegisterActivity.this, "El email ya está registrado", Toast.LENGTH_LONG).show();
                            } else {
                                Toast.makeText(RegisterActivity.this, "Error en el registro", Toast.LENGTH_LONG).show();
                            }
                        }
                    });



                } catch (Exception e) {
                    e.printStackTrace();
                    // Mostrar error en el hilo principal (UI Thread)
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(RegisterActivity.this, "Error en la conexión: " + e.getMessage(), Toast.LENGTH_LONG).show();
                        }
                    });
                }
            }
        }).start();
    }
}