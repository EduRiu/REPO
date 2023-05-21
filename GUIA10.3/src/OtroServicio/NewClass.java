/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OtroServicio;

/**
 *
 * @author Edu

public class NewClass {
    
     public Alumno crearAlumno(){
        int aux2;
        ArrayList<Integer> auxNotasList = new ArrayList();
        Alumno puente = new Alumno();
        System.out.print("Nombre:");
        puente.setNombre(leer.next());
        System.out.println("Notas: ");
        for (int i = 0; i < 3; i++) {
            auxNotasList.add(leer.nextInt());
        }
        puente.setNotas(auxNotasList);
    
        // otra forma de crear alumno
        // es hacer void
        // listaAlumno.add(new Alumno(nobre,auxNotasList)
        
        return puente;
    }
    
    public void listaAlumnos(){
        do {
            listaAlumno.add(this.crearAlumno());
            System.out.println("Desea cargar otro: s/n");
            if(leer.next().equalsIgnoreCase("n")){
                break;
            }
        } while (true);
    }
    
    public void notaFinal(){
        Iterator<Alumno> auxITE = listaAlumno.iterator();
        System.out.println("Ingrese nombre del alumno: ");
        String buscado = leer.next();
        int suma = 0;
        while (auxITE.hasNext()) {
            Alumno next = auxITE.next();
            if (next.getNombre().equals(buscado)) {
                for (int aux : next.getNotas()) {
                    suma = suma + aux;
                }
            }
        }
        System.out.println(buscado +" promedio: "+ (suma/3));
    }
}
}
*/