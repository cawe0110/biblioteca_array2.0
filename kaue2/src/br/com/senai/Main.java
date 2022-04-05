package br.com.senai;

import br.com.senai.model.Autor;
import br.com.senai.model.Biblioteca;
import br.com.senai.model.Endereco;
import br.com.senai.model.Livro;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args){
        ArrayList<Livro> book = new ArrayList<Livro>();
        Livro Medo = new Livro("0001", "Osho", "Medo");
        Livro Agilidade_emocinal = new Livro("0002", "Susan David", "Agilidade Emocional");
        Livro Conversas_dificeis = new Livro("0003", "Douglas Stone", "Coversas Dificeis");
        Livro Labirinto_do_Fauno = new Livro("0004", "Guilhermo Deltoro", "Labirinto do Fauno");
        Livro A_Menina_que_Roubava_Livros = new Livro("0005", "Markus Zuzak", "A Menina que Roubava Livros");
        Livro Death_Note = new Livro("0006", "Tsugumi Ohba", "Death Note");
        Livro Formigas= new Livro("0007", "William Douglas", "Formigas");

        ArrayList<Endereco> endereco = new ArrayList<Endereco>();
        Endereco Florianopolis = new Endereco("22222", "223344", "222");
        Endereco Cidade_de_Itajai = new Endereco("11111", "112233", "111");
        Endereco A001 = new Endereco("00001", "0000001", "00001");
        Endereco A002 = new Endereco("00002", "0000002", "00002");
        Endereco A003 = new Endereco("00003", "0000003", "00003");
        Endereco A004 = new Endereco("00004", "0000004", "00004");
        Endereco A005 = new Endereco("00005", "0000005", "00005");
        Endereco A006 = new Endereco("00006", "0000006", "00006");
        Endereco A007 = new Endereco("00007", "0000007", "00007");

        ArrayList<Autor> detalhes_autor = new ArrayList<Autor>();
        Autor Osho = new Autor("00001", "Osho", A001 );
        Autor Susan_David = new Autor("00002", "Susan David", A002 );
        Autor Douglas_Stone = new Autor("00003", "Douglas Stone", A003 );
        Autor Guilhermo_Deltoro = new Autor("00004", "Guilhermo Deltoro", A004 );
        Autor Markus_Zuzak = new Autor("00005", "Markus Zuzak", A005 );
        Autor Tsugumi_Ohba = new Autor("00006", "Tsugumi Ohba", A006 );
        Autor William_Douglas = new Autor("00007", "William Douglas", A007 );
        for(int i=0 ; i<detalhes_autor.size(); i++)
        {
            System.out.println(
                    detalhes_autor.get(i).getId_autor() + "\n" +
                            detalhes_autor.get(i).getNome_pessoa() + "\n"+
                            detalhes_autor.get(i).getEndereco_pessoa().getId_endereco() + "\n"
            );
        }


        ArrayList<Biblioteca> floripa = new ArrayList<Biblioteca>();
        floripa.add(new Biblioteca("Floripa", "2222", Medo, Florianopolis ));
        floripa.add(new Biblioteca("Floripa", "2222", Agilidade_emocinal, Florianopolis));
        floripa.add(new Biblioteca("Floripa", "2222", Conversas_dificeis, Florianopolis));
        floripa.add(new Biblioteca("Floripa", "2222", Labirinto_do_Fauno, Florianopolis));
        floripa.add(new Biblioteca("Floripa", "2222", A_Menina_que_Roubava_Livros, Florianopolis));
        for(int i=0 ; i<floripa.size(); i++)
        {
            System.out.println
                    ("{" + floripa.get(i).getNome_bibli()
                            +" "+ floripa.get(i).getId_bibli() + "}"+" "+
                            floripa.get(i).getLivros().getNome() +" / "+ floripa.get(i).getLivros().getId_livro()
                            +" / "+ floripa.get(i).getLivros().getAutor()+ " / "
                            +floripa.get(i).getEndereco_bibli().getId_endereco() +" / "+ floripa.get(i).getEndereco_bibli().getCep()
                            + " / " +floripa.get(i).getEndereco_bibli().getNumero_endereco());
        }

        System.out.println("\n");

        ArrayList<Biblioteca> itajai = new ArrayList<Biblioteca>();
        itajai.add(new Biblioteca("Itajai", "1111", Medo, Cidade_de_Itajai));
        itajai.add(new Biblioteca("Itajai", "1111", A_Menina_que_Roubava_Livros, Cidade_de_Itajai));
        itajai.add(new Biblioteca("Itajai", "1111", Death_Note, Cidade_de_Itajai));
        itajai.add(new Biblioteca("Itajai", "1111", Formigas, Cidade_de_Itajai));
        itajai.add(new Biblioteca("Itajai", "1111", Conversas_dificeis, Cidade_de_Itajai));
        for(int i=0 ; i<itajai.size(); i++)

            {System.out.println
                ("{" + itajai.get(i).getNome_bibli()
                        +" "+ itajai.get(i).getId_bibli() + "}"+" "+
                        itajai.get(i).getLivros().getNome() + " / " +
                        itajai.get(i).getLivros().getId_livro()+ " / "+ itajai.get(i).getLivros().getAutor() + " / "
                    +itajai.get(i).getEndereco_bibli().getId_endereco() +" / "+ itajai.get(i).getEndereco_bibli().getCep()
                + " / " +itajai.get(i).getEndereco_bibli().getNumero_endereco());
        }

    }
}