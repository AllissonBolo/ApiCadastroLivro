package br.sp.gov.etec.cadastroLivro

import org.springframework.data.jpa.repository.JpaRepository

interface LivroRepository : JpaRepository<Livro, Long>
