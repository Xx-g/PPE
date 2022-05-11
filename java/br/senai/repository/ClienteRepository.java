package br.senai.repository;

import br.senai.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    public Cliente findByNome(String nome);
    public Cliente findByLocalizacao(String localizacao);
    public Cliente findByRazaSocial(String razaoSocial);
}
