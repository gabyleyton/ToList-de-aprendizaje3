package com.example.tolist_de_aprendizaje;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class RegisterActivity extends AppCompatActivity {

    private EditText inputNombre, inputEmail, inputTelefono, inputPassw1, inputConfirmPassw;
    private TextView tvTituloForm, textMessage;
    private Button btnRegistrar, btnBack;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);

        // Inicialización de los elementos del layout
        inputNombre = findViewById(R.id.inputNombre);
        inputEmail = findViewById(R.id.inputEmail);
        inputTelefono = findViewById(R.id.inputTelefono);
        inputPassw1 = findViewById(R.id.inputPassw1);
        inputConfirmPassw = findViewById(R.id.inputConfirmPassw);

        tvTituloForm = findViewById(R.id.tvTituloForm);
        textMessage = findViewById(R.id.textMessage);

        btnRegistrar = findViewById(R.id.btnRegistrar);
        btnBack = findViewById(R.id.btnBack);

        // Lógica para regresar al MainActivity con btnBack
        btnBack.setOnClickListener(v -> finish());

        // Lógica del botón de registro
        btnRegistrar.setOnClickListener(v -> {
            String nombre = inputNombre.getText().toString();
            String email = inputEmail.getText().toString();
            String telefono = inputTelefono.getText().toString();
            String passw1 = inputPassw1.getText().toString();
            String passw2 = inputConfirmPassw.getText().toString();

            if (passw1.equals(passw2)) {
                // Enviar datos a la base de datos mediante una petición HTTP
                new RegistrarUsuarioTask().execute(nombre, email, telefono, passw1);
            } else {
                textMessage.setText("Las contraseñas no coinciden");
                Toast.makeText(RegisterActivity.this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show();
            }
        });
    }

    // AsyncTask para realizar la petición HTTP en segundo plano
    private class RegistrarUsuarioTask extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... params) {
            String nombre = params[0];
            String email = params[1];
            String telefono = params[2];
            String password = params[3];

            try {
                // Definir la URL del archivo PHP
                URL url = new URL("http://10.0.2.2/register.php");
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("POST");
                conn.setDoOutput(true);
                conn.setDoInput(true);

                // Preparar los datos a enviar
                String data = URLEncoder.encode("nombre", "UTF-8") + "=" + URLEncoder.encode(nombre, "UTF-8") + "&" +
                        URLEncoder.encode("email", "UTF-8") + "=" + URLEncoder.encode(email, "UTF-8") + "&" +
                        URLEncoder.encode("telefono", "UTF-8") + "=" + URLEncoder.encode(telefono, "UTF-8") + "&" +
                        URLEncoder.encode("password", "UTF-8") + "=" + URLEncoder.encode(password, "UTF-8");

                // Enviar los datos al servidor
                Writer writer = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
                writer.write(data);
                writer.flush();
                writer.close();

                // Leer la respuesta del servidor
                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder result = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    result.append(line);
                }
                reader.close();

                return result.toString();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);
            if (result != null && result.equals("success")) {
                Toast.makeText(RegisterActivity.this, "Registro exitoso", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(RegisterActivity.this, "Error en el registro", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
