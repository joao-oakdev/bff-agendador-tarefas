package com.oakdev.bffagendadortarefas.business.service;


import com.oakdev.bffagendadortarefas.business.dto.in.EnderecoDTORequest;
import com.oakdev.bffagendadortarefas.business.dto.in.LoginRequestDTO;
import com.oakdev.bffagendadortarefas.business.dto.in.TelefoneDTORequest;
import com.oakdev.bffagendadortarefas.business.dto.in.UsuarioDTORequest;
import com.oakdev.bffagendadortarefas.business.dto.out.EnderecoDTOResponse;
import com.oakdev.bffagendadortarefas.business.dto.out.TelefoneDTOResponse;
import com.oakdev.bffagendadortarefas.business.dto.out.UsuarioDTOResponse;
import com.oakdev.bffagendadortarefas.infrastructure.client.UsuarioClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UsuarioService {

    private final UsuarioClient client;

    public UsuarioDTOResponse salvaUsuario(UsuarioDTORequest usuarioDTO) {
        return client.salvaUsuario(usuarioDTO);
    }

    public String loginUsuario(LoginRequestDTO dto) {
        return client.login(dto);
    }

    public UsuarioDTOResponse buscaUsuarioPorEmail(String email, String token) {
        return client.buscaUsuarioPorEmail(email, token);
    }

    public void deletaUsuarioPorEmail(String email, String token) {
        client.deletaUsuarioPorEmail(email, token);
    }

    public UsuarioDTOResponse atualizaDadosUsuario(String token, UsuarioDTORequest dto) {
        return client.atualizarDadosUsuario(dto, token);
    }

    public EnderecoDTOResponse atualizaEndereco(Long idEndereco, EnderecoDTORequest enderecoDTO, String token) {
        return client.atualizaEndereco(enderecoDTO, idEndereco, token);
    }

    public TelefoneDTOResponse atualizaTelefone(Long idTelefone, TelefoneDTORequest telefoneDTO, String token) {
        return client.atualizaTelefone(telefoneDTO, idTelefone, token);
    }

    public EnderecoDTOResponse cadastraEndereco(String token, EnderecoDTORequest dto) {
        return client.cadastraEndereco(dto, token);
    }

    public TelefoneDTOResponse cadastraTelefone(String token, TelefoneDTORequest dto) {
        return client.cadastraTelefone(dto, token);
    }

}

