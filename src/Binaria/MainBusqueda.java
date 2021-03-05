package Binaria;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainBusqueda {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        solicitarDatos();
    }
    public static void solicitarDatos(){
        System.out.println("Sea bienvenido a Papelerías y Liberías IDS");
        int respuesta2;
        do{
            System.out.println("Tenemos a la venta 1-Borradores, 2-Lapices y 3-Libros");
            System.out.println("Dijite lo que desea buscar: ");
            int respuesta=entrada.nextInt();
            switch (respuesta){
                case 1: buscarBorradores();
                    break;
                case 2: buscarLapices();
                    break;
                case 3: buscarLibros();
                    break;
                default:
                    System.out.println("opcion invalida");
            }
            System.out.println("Desea volver a buscar algo 1=si 2=no");
            respuesta2=entrada.nextInt();
        }while(respuesta2==1);
    }
    public static void buscarBorradores(){
        Borrador l1, l2, l3, l4, l5,l6,l7,l8,l9,l10;
        l1 = new Borrador("Tinta","Grande");
        l2 = new Borrador("Lapiz","Grande");
        l3 = new Borrador("Tinta","Chico");
        l4 = new Borrador("Lapiz","Grande");
        l5 = new Borrador("Tinta","Chico");
        l6 = new Borrador("Lapiz","Chico");
        l7 = new Borrador("Tinta","Grande");
        l8 = new Borrador("Lapiz","Grande");
        l9 = new Borrador("Tinta","Chico");
        l10 = new Borrador("Lapiz","Grande");
        ArrayList<Borrador> lista= new ArrayList<>();
        lista.add(l1);
        lista.add(l2);
        lista.add(l3);
        lista.add(l4);
        lista.add(l5);
        lista.add(l6);
        lista.add(l7);
        lista.add(l8);
        lista.add(l9);
        lista.add(l10);
        Collections.sort(lista);
        System.out.println("Digite el tipo de borrador que desea: Tinta o Lapiz");
        String tipo = entrada.next();
        System.out.println("Digite el tamaño que busca: Grande o Chico");
        String tamanio = entrada.next();
        Borrador buscar = new Borrador(tipo,tamanio);
        System.out.println(lista);
        Search<Borrador> s = new Search<>();
        int encontrado=-1;
        encontrado=(s.binaria(lista,buscar,false));
        if (encontrado>=0) System.out.println("El Lapiz existe y se encuentra en la posicion "+encontrado+" del arraylist");
        else System.out.println("No existe, codigo"+encontrado);
    }

    public static void buscarLapices(){
        Lapiz l1, l2, l3, l4, l5,l6,l7,l8,l9,l10;
        l1 = new Lapiz("Amarillo",1);
        l2 = new Lapiz("blanco",3);
        l3 = new Lapiz("Cafe",1);
        l4 = new Lapiz("Amarillo",2);
        l5 = new Lapiz("blanco",1);
        l6 = new Lapiz("Amarillo",3);
        l7 = new Lapiz("blanco",1);
        l8 = new Lapiz("Amarillo",2);
        l9 = new Lapiz("blanco",1);
        l10 = new Lapiz("Cafe",3);
        ArrayList<Lapiz> lista= new ArrayList<>();
        lista.add(l1);
        lista.add(l2);
        lista.add(l3);
        lista.add(l4);
        lista.add(l5);
        lista.add(l6);
        lista.add(l7);
        lista.add(l8);
        lista.add(l9);
        lista.add(l10);
        Collections.sort(lista);
        System.out.println("digite el numero del lapiz que desea buscar: 1,2,3");
        int numero = entrada.nextInt();
        System.out.println("Digite el color del lapiz que desea buscar Con la primera letra mayuscula ej. Cafe");
        String color=entrada.next();
        Lapiz buscar = new Lapiz(color,numero);
        System.out.println(lista);
        Search<Lapiz> s = new Search<>();
        int encontrado=-1;
        encontrado=(s.binaria(lista,buscar,false));
        if (encontrado>=0) System.out.println("El Lapiz existe y se encuentra en la posicion "+encontrado+" del arraylist");
        else System.out.println("No existe, codigo"+encontrado);
    }
    public static void buscarLibros(){
        Libro l1, l2, l3, l4, l5,l6,l7,l8,l9,l10;
        l1 = new Libro("Fuegos",256);
        l2 = new Libro("Comedia",278);
        l3 = new Libro("Principito",567);
        l4 = new Libro("Luna",459);
        l5 = new Libro("HungerGames",589);
        l6 = new Libro("Lugares",200);
        l7 = new Libro("Chupa",167);
        l8 = new Libro("Elite",432);
        l9 = new Libro("Atlas",789);
        l10 = new Libro("Criaturitas",123);
        ArrayList<Libro> lista= new ArrayList<>();
        lista.add(l1);
        lista.add(l2);
        lista.add(l3);
        lista.add(l4);
        lista.add(l5);
        lista.add(l6);
        lista.add(l7);
        lista.add(l8);
        lista.add(l9);
        lista.add(l10);
        Collections.sort(lista);
        System.out.println("digite el nombre del libro que desea buscar: ");
        String titulo = entrada.next();
        Libro buscar = new Libro(titulo,0);
        System.out.println(lista);
        Search<Libro> s = new Search<>();
        int encontrado=-1;
        encontrado=(s.binaria(lista,buscar,false));
        if (encontrado>=0) System.out.println("El libro existe y se encuentra en la posicion "+encontrado+" del arraylist");
        else System.out.println("No existe, codigo"+encontrado);
    }
}