package br.sp.gov.etec.cadastroLivro

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/livros")
class LivroController(
    private val livroRepository: LivroRepository
) {

    @PostMapping
    fun cadastrarLivro(@RequestBody livro: Livro): Livro {
        return livroRepository.save(livro)
    }
}
