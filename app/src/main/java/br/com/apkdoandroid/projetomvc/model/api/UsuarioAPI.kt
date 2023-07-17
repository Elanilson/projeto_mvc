package br.com.apkdoandroid.projetomvc.model.api

import br.com.apkdoandroid.projetomvc.model.Usuario

class UsuarioAPI {

    fun recuperarUsuarios() : List<Usuario>{
        return listOf(
            Usuario("Elanilson",27),
            Usuario("Anna",25),
            Usuario("Joao",26),
        )

    }
}