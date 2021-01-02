package com.pokemon;

public class PokemonTest{
   public static void main(String[] args){
        Pokedex dOne= new Pokedex();
        Pokemon pOne=dOne.createPokemon("pokemon1", 100, "type1");
        Pokemon pTwo=dOne.createPokemon("pokemon2", 100, "type2");
        System.out.println(pOne.getName()+" "+String.valueOf(pOne.getHealth()));
        System.out.println(pTwo.getName()+" "+String.valueOf(pTwo.getHealth()));
        pTwo.attackPokemon(pOne);
        System.out.println(pOne.getName()+" "+String.valueOf(pOne.getHealth()));
        System.out.println(pTwo.getName()+" "+String.valueOf(pTwo.getHealth()));
        System.out.println("list of Pokemons : ");
        dOne.listPokemon();
    }
}
