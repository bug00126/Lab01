package ss.labs.pokemon;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);   //TODO declare and initiate a Scanner

        ArrayList<PokemonData> pokedex = new ArrayList();    //TODO declare and initiate pokedex as an ArrayList to store pokemon data

        HashMap<String, Integer> typeCountingMap = new HashMap();   //TODO declare and initiate typeCountMap as a HashMap to count the number of each types of pokemon

        System.out.println("Enter the Number of pokemon in the pokedex:");
        int a = scanner.nextInt();   //TODO 0: scan the number of the testData from user input

        //TODO use a loop to read several input data
        for (int i=0; i<a; i++)
        {
            System.out.println("Enter pokemon name:");
            String name = scanner.next();    //TODO 1-1:scan pokemon name and save to a variable from user input

            System.out.println("Enter pokemon type:");
            String type = scanner.next();    //TODO 1-2:scan pokemon type and save to a variable

            System.out.println("Enter pokemon's move name:");
            String move = scanner.next();    //TODO 1-3:scan pokemon move's name

            PokemonData pokedata = new PokemonData(name, type, move);   //TODO 2-1:create a new pokemon data from the above variables

            pokedex.add(pokedata);  //TODO 2-2:add the pokemon data into pokedex

            if (!typeCountingMap.containsKey(type)) {//TODO 4: Tricky part!! get the value from the type counting map , add 1 and put it back (multiple line
                typeCountingMap.put(type, i);
            }


        }

        for (int i=0; i<a; i++) {   //TODO 5 print out the created pokemon information (multiple lines
            System.out.println ("name: "+pokedex.get(i).name+", type: "+pokedex.get(i).type+", move's name: "+pokedex.get(i).move);
        }

        System.out.println (typeCountingMap.size());//TODO 6 print out how many type of pokemons in the pokedex

    }
}
