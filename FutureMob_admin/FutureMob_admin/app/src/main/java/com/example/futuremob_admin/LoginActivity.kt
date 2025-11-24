package com.example.futuremob_admin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.futuremob_admin.models.LoginRequest
import com.example.futuremob_admin.models.UsuarioResponse
import com.example.futuremob_admin.service.UsuarioService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val emailInput = findViewById<EditText>(R.id.editEmail)
        val senhaInput = findViewById<EditText>(R.id.editSenha)
        val btnLogin = findViewById<Button>(R.id.btnEntrar)

        btnLogin.setOnClickListener {
            val email = emailInput.text.toString().trim()
            val senha = senhaInput.text.toString().trim()

            autenticar(email, senha)
        }
    }

    private fun autenticar(email: String, senha: String) {
        val service = ClientRetrofit.instance.create(UsuarioService::class.java)

        val login = LoginRequest(email, senha)

        service.login(login)
            .enqueue(object : Callback<UsuarioResponse> {

                override fun onResponse(
                    call: Call<UsuarioResponse>,
                    response: Response<UsuarioResponse>
                ) {
                    if (response.isSuccessful) {
                        val usuario = response.body()
                        Toast.makeText(this@LoginActivity, "Bem-vindo, ${usuario?.nome}", Toast.LENGTH_LONG).show()
                        startActivity(Intent(this@LoginActivity, MainActivity::class.java))

                    } else {
                        Toast.makeText(this@LoginActivity, "Credenciais inválidas!", Toast.LENGTH_SHORT).show()

                    }
                }

                override fun onFailure(call: Call<UsuarioResponse>, t: Throwable) {
                    Toast.makeText(this@LoginActivity, "Erro: ${t.message}", Toast.LENGTH_LONG).show()
                }
            })
    }

}