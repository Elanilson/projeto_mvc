package br.com.apkdoandroid.projetomvc.controller

import br.com.apkdoandroid.projetomvc.model.api.UsuarioAPI
import br.com.apkdoandroid.projetomvc.view.MainActivity

class UsuarioController (val mainActivity: MainActivity){
    val usuarioAPI = UsuarioAPI()
    fun recuperarUsuarios() {

        mainActivity.listarUsuarios(usuarioAPI.recuperarUsuarios())
    }
}