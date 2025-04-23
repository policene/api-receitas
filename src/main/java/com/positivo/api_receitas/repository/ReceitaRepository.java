package com.positivo.api_receitas.repository;

import com.positivo.api_receitas.entities.Receita;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class ReceitaRepository {

    private List<Receita> receitas = new ArrayList<>();

    public ReceitaRepository() {

        receitas.add(new Receita(
                1,
                "Macarrão ao Alho e Óleo",
                "Receita simples e rápida, perfeita para quando a despensa está quase vazia.",
                Arrays.asList("macarrão", "alho", "óleo", "sal", "pimenta-do-reino")
        ));

        receitas.add(new Receita(
                2,
                "Panqueca de Banana",
                "Panqueca saudável sem açúcar, perfeita para o café da manhã.",
                Arrays.asList("banana", "ovo", "aveia", "canela")
        ));

        receitas.add(new Receita(
                3,
                "Omelete de Legumes",
                "Omelete leve e nutritivo com legumes variados.",
                Arrays.asList("ovo", "cenoura", "tomate", "cebola", "sal", "pimenta")
        ));

        receitas.add(new Receita(
                4,
                "Salada de Grão-de-Bico",
                "Salada refrescante e rica em proteínas vegetais.",
                Arrays.asList("grão-de-bico", "tomate", "cebola roxa", "azeite", "limão", "sal")
        ));

        receitas.add(new Receita(
                5,
                "Arroz de Forno com Sobras",
                "Receita ótima para reaproveitar ingredientes da geladeira.",
                Arrays.asList("arroz", "frango desfiado", "milho", "ervilha", "molho de tomate", "queijo ralado")
        ));

        receitas.add(new Receita(
                6,
                "Tapioca com Queijo e Tomate",
                "Opção rápida e leve para café da manhã ou lanche da tarde.",
                Arrays.asList("goma de tapioca", "queijo", "tomate", "orégano", "sal")
        ));

        receitas.add(new Receita(
                7,
                "Sopa de Abóbora com Gengibre",
                "Sopa cremosa e reconfortante, ótima para dias frios.",
                Arrays.asList("abóbora", "cebola", "alho", "gengibre", "azeite", "sal", "água")
        ));

        receitas.add(new Receita(
                8,
                "Wrap Integral de Frango",
                "Refeição leve e prática, ideal para levar na marmita.",
                Arrays.asList("tortilha integral", "frango desfiado", "alface", "tomate", "maionese light")
        ));

        receitas.add(new Receita(
                9,
                "Cuscuz Nordestino",
                "Tradicional receita brasileira, simples e versátil.",
                Arrays.asList("flocos de milho", "água", "sal", "manteiga")
        ));

        receitas.add(new Receita(
                10,
                "Smoothie de Morango com Aveia",
                "Bebida nutritiva e refrescante, perfeita para o café da manhã.",
                Arrays.asList("morango", "banana", "leite", "aveia", "mel")
        ));

        receitas.add(new Receita(
                11,
                "Bolinho de Chuva",
                "Clássico da vovó, perfeito para um café da tarde com chuva.",
                Arrays.asList("farinha de trigo", "açúcar", "leite", "ovo", "fermento", "canela", "óleo para fritar")
        ));

        receitas.add(new Receita(
                12,
                "Guacamole Rápido",
                "Receita mexicana simples, ótima como entrada ou acompanhamento.",
                Arrays.asList("abacate", "tomate", "cebola", "limão", "sal", "coentro")
        ));

        receitas.add(new Receita(
                13,
                "Pizza de Frigideira",
                "Pizza caseira fácil e rápida feita na frigideira.",
                Arrays.asList("farinha de trigo", "fermento químico", "água", "sal", "molho de tomate", "queijo", "orégano")
        ));

        receitas.add(new Receita(
                14,
                "Escondidinho de Carne Moída",
                "Prato completo com purê e carne, ideal para o almoço.",
                Arrays.asList("batata", "carne moída", "leite", "manteiga", "sal", "queijo ralado")
        ));

        receitas.add(new Receita(
                15,
                "Bolo de Caneca de Chocolate",
                "Sobremesa rápida feita no micro-ondas em poucos minutos.",
                Arrays.asList("farinha de trigo", "açúcar", "leite", "ovo", "chocolate em pó", "fermento", "óleo")
        ));

        receitas.add(new Receita(
                16,
                "Homus",
                "Pasta de grão-de-bico cremosa e temperada, servida como entrada ou acompanhamento.",
                Arrays.asList("grão-de-bico", "tahine", "alho", "limão", "azeite", "sal")
        ));

        receitas.add(new Receita(
                17,
                "Tabule",
                "Salada fresca e leve feita com trigo para quibe e hortaliças.",
                Arrays.asList("trigo para quibe", "salsinha", "hortelã", "cebola", "tomate", "limão", "azeite", "sal")
        ));

        receitas.add(new Receita(
                18,
                "Esfiha de Carne",
                "Tradicional salgado árabe recheado com carne temperada.",
                Arrays.asList("farinha de trigo", "fermento biológico", "carne moída", "cebola", "limão", "sal", "pimenta síria")
        ));

        receitas.add(new Receita(
                19,
                "Falafel",
                "Bolinho frito de grão-de-bico e ervas, muito consumido no Oriente Médio.",
                Arrays.asList("grão-de-bico", "salsinha", "cebola", "alho", "coentro", "cominho", "sal", "fermento")
        ));

        receitas.add(new Receita(
                20,
                "Arroz com Lentilhas (Mujaddara)",
                "Prato simples e saboroso feito com arroz, lentilhas e cebola caramelizada.",
                Arrays.asList("arroz", "lentilha", "cebola", "azeite", "sal", "pimenta")
        ));


    }

    public List<Receita> getAll () {
        return receitas;
    }

    public Receita getById (int id) {
        return receitas.stream().filter(receita -> receita.getId() == id).findFirst().orElse(null);
    }

}
