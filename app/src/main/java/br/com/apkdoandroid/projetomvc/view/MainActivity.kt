package br.com.apkdoandroid.projetomvc.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.apkdoandroid.projetomvc.R
import br.com.apkdoandroid.projetomvc.controller.UsuarioController
import br.com.apkdoandroid.projetomvc.databinding.ActivityMainBinding
import br.com.apkdoandroid.projetomvc.model.Usuario

class MainActivity : AppCompatActivity() {
    private lateinit var usuarioController : UsuarioController
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        usuarioController = UsuarioController(this)

        binding.button.setOnClickListener {
            usuarioController.recuperarUsuarios()
        }
    }

    fun listarUsuarios(recuperarUsuarios: List<Usuario>) {
        var textoUsuario = ""
        recuperarUsuarios.forEach {  usuario ->
            textoUsuario +=  "Nome: ${usuario.nome} idade: ${usuario.idade} \n"
        }
        binding.TextView.text = textoUsuario

    }
}