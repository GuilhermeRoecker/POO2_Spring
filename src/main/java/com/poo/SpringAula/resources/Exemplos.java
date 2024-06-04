package com.poo.SpringAula.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.poo.SpringAula.model.Cidade;


@RestController
@RequestMapping("/exemplos")
public class Exemplos {

    @PostMapping
    public String cadastraCidade(@RequestBody Cidade cidade){
        //metodo de cadasto

        return cidade.toString();
    }
    
    @GetMapping
    public String retornaOlaMundo(){
        return "Olá Mundo";
    }

    //Nome vai junto na URL
    @GetMapping("/{nome}")
    public String messagemComNome(@PathVariable String nome){
        return "Olá Mundo " + nome;
    }

    // @GetMapping
    // public String messagemComNome(String nome){
    //     return "Olá Mundo " + nome;
    // }

    @GetMapping("/soma")
    public double soma(@RequestParam double n1 , @RequestParam double n2){
        return n1 + n2;
    }

    @GetMapping("/dados")
    public static String dados(@RequestParam int qtdDados, @RequestParam int aposta){
        if(qtdDados < 1 || qtdDados > 4){
            return "Quantidade de dados Invalidas";
        }else {
            if((aposta >= qtdDados*1) && (aposta <= qtdDados * 6)){
                int total = 0;
                String dadosSorteados= "";
                for(int i = 0; i < qtdDados; i++){
                    int dados = (int) (Math.random() * 6) +1;
                    total += dados;
                    dadosSorteados += "Dado" + (i+1) +": " + dados+ ", ";
                }
                double percentual = (aposta - (double) total )/ aposta * 100;
                return "Foram jogados " + qtdDados + " Dados <br>" 
                +"O valor da aposta foi de: " + aposta
                + "<br>" +dadosSorteados + 
                "<br>O valor final foi de: " + total
                + "<br>O percentual da aposta foi de " + (int)percentual + "%";
            }else{
                return "Aposta Invalida";
            }
        }
    }
}
