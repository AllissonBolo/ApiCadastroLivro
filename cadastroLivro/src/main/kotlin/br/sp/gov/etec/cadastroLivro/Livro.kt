package br.sp.gov.etec.cadastroLivro

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Livro(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    val titulo: String,
    val autor: String,
    val anoPublicacao: Int
)
