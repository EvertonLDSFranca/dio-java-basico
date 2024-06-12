package aparelho;

import funcoes.aparelhoTelefonico.aparelhoTelefonico;
import funcoes.navegador.navegador;
import funcoes.reprodutorMusical.reprodutorMusical;

public class aparelhoIphone implements aparelhoTelefonico, navegador, reprodutorMusical{

    @Override
    public void atender() {
    
        System.out.println("Atendendo Ligação.");
        
    }

    @Override
    public void correioVoz() {

        System.out.println("Deixando mensagem de Voz.");
        
    }

    @Override
    public void ligar() {

        System.out.println("Realizando Ligação.");
        
    }

    @Override
    public void adicionarNovaAba() {

        System.out.println("Adicionando nova aba.");
        
    }

    @Override
    public void atualizarPagina() {

        System.out.println("Atualizando pagina.");
        
    }

    @Override
    public void exibirPagina() {

        System.out.println("Exibindo pagina.");
        
    }

    @Override
    public void pausar() {
        
        System.out.println("Pausando musica.");

    }

    @Override
    public void selecionarMusica() {

        System.out.println("Selecionando musica.");
        
    }

    @Override
    public void tocar() {

        System.out.println("Tocando musica.");
        
    }
}
