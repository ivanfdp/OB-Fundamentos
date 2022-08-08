/*
Crea una clase Persona con las siguientes variables:

 - La edad
 - El nombre
 - El teléfono

Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.
 */

package com.OB.ejercicios.tema_9;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(41);
        cliente.setNombre("Iván");
        cliente.setTelefono("+34600600600");
        cliente.setCredito(10000);
        System.out.println("Hola! Soy " + cliente.getNombre() + " tengo " + cliente.getEdad() + " años y mi número de teléfono es " + cliente.getTelefono() + ". Actualmente tengo un crédito de " + cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(41);
        trabajador.setNombre("Iván");
        trabajador.setTelefono("+34600600600");
        trabajador.setSalario(3000);
        System.out.println("Hola! Soy " + trabajador.getNombre() + " tengo " + trabajador.getEdad() + " años y mi número de teléfono es " + trabajador.getTelefono() + ". Actualmente tengo un salario de " + trabajador.getSalario());

    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona {
    private int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    private int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
