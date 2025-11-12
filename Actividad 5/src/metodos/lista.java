
package metodos;

import javax.swing.JOptionPane;

/**
 *
 * @author HP-FLIABC
 */
public class lista {
    
    nodo cab; clon cab2;
    
    
    lista()
    {
        cab=null;
        cab2=null;
    }
    
   int getLongLista()
   {
        int c=0;
        nodo q;
        if(cab==null)
            return c;
        else{
            q = cab;
            while(q!=null)
            {
                c++;
                q = q.sig;
            }
        }
        return c;
    } 
   
   nodo BuscarP(int id, String nombre, String Tipoid)
   {
       if(cab==null)
           return null;
       else
       {
          nodo p = cab;
          while(p!=null)
          {
            if((p.identificacionpaciente==id)&&(!p.Nombrepaciente.equalsIgnoreCase(nombre)&&(p.Tipoid.equalsIgnoreCase(Tipoid))))
                return p;
            else
                p=p.sig;
          }
       }
       return null;
   }
   
       nodo BuscarId(int id)
       {
        if(cab==null)
            return null;
        else{
            nodo p = cab;
            while(p!=null)
            {
                if(p.identificacionpaciente==id)
                    return p;
                else 
                    p = p.sig;
            }
        }
       return null; 
    }
   
   int Cardiologo(){
        int cardio = 0;
        
       nodo p = cab;
       while(p!=null){
           if(p.especialista.equalsIgnoreCase("CARDIOLOGO")){
               cardio++;
           }
           p = p.sig;
       }
       return cardio;
    }
   
    int Otorrino(){
        int oto = 0;
           nodo p = cab;
       while(p!=null){
           if(p.especialista.equalsIgnoreCase("OTORRINO")){
               oto++;
           }
           p = p.sig;
       }
       return oto;
    }
    
    int Gastroenterologo(){
        int gastro = 0;
           nodo p = cab;
       while(p!=null){
           if(p.especialista.equalsIgnoreCase("GASTROENTEROLOGO")){
               gastro++;
           }
           p = p.sig;
       }
       return gastro;
    }
   
   nodo Cita(float hora, String nombreDoc, String fecha, String especialista)
   {
      nodo p = cab;
      while (p!=null)
      {
          if(p.hora==hora && (p.fecha.equalsIgnoreCase(fecha)) && p.Nombredoc.equalsIgnoreCase(nombreDoc) && p.especialista.equalsIgnoreCase(especialista))
             return p;
          p=p.sig;
      }
      return null;
   }
   
  nodo Registro()
  {
  int idpaciente;
  float hora;
  String Tipoid, nompaciente;
  String especialista, Nomdoc, fecha;
  nodo p = null;
  do{
      idpaciente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la identificación del paciente: "));
      Tipoid = JOptionPane.showInputDialog("Ingrese el tipo de documento de identificación: ");
      nompaciente = JOptionPane.showInputDialog("Ingrese el nombre del paciente: ");
      p = BuscarP(idpaciente, nompaciente, Tipoid);
      if(p!=null)
            JOptionPane.showMessageDialog(null, "¡¡¡EL NOMBRE NO COINCIDE CON EL NUMERO Y TIPO DE DOCUMENTO YA REGISTRADO!!!");
    }while(p!=null);
    do
    {
      especialista = JOptionPane.showInputDialog("Ingrese con que especialista desea la cita [Cardiologo, Otorrino ó Gastroenterologo]: ");
        if(Cardiologo() == 5 || Otorrino()==5 || Gastroenterologo() == 5)
        {
         if(Cardiologo() == 5)
             JOptionPane.showMessageDialog(null, "¡¡¡NO HAY CITAS DISPONIBLES CON CARDIOLOGO!!!");
         if(Otorrino()==5)
              JOptionPane.showMessageDialog(null, "¡¡¡NO HAY CITAS DISPONIBLES CON OTORRINO!!!");
         if(Gastroenterologo() == 5)
             JOptionPane.showMessageDialog(null, "¡¡¡NO HAY CITAS DISPONIBLES CON GASTROENTEROLOGO!!!");
        }
    }while(Cardiologo() == 5 || Otorrino()==5 || Gastroenterologo() == 5);
    do
    {
     fecha = (JOptionPane.showInputDialog("Ingrese la fecha de la consulta FORMATO: [MM/ DD /AAAA]"));
     do
     {
         hora = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la hora de la consulta: [FORMATO 24H]"));
         
         if(hora > 23.60)
             JOptionPane.showMessageDialog(null, "INCOMPATIBILIDAD CON EL FORMATO MANEJADO");
         
     }while(hora > 23.60);
       
      Nomdoc = JOptionPane.showInputDialog("ingrese el nombre del doctor con quien quiere la consulta: ");
      p = Cita(hora, Nomdoc, fecha, especialista) ;
      if(p!=null)
         JOptionPane.showMessageDialog(null, "¡Ya hay una cita previa con estos datos!\n"+"\t\t\t¡¡¡POR FAVOR INTENTE CON OTRA HORA U OTRO DÍA!!!");
     
    }while(p!=null);
     nodo q = new nodo(idpaciente, hora, Tipoid, nompaciente, Nomdoc, fecha, especialista);
     return q;
  } 
   
  void Antencion()
  {
    int idpaciente, i = 0;
    float hora;
    String Tipoid, Nompaciente, Nomdoc, fecha;
    String especialista;
    nodo p = cab;
    do
    {
     p = cab;
     nodo q = p.sig;
     while(p.sig!=null)
     {
        if(p.especialista.compareTo(q.especialista)>0)
        {
            hora = p.hora;
            idpaciente= p.identificacionpaciente;
            fecha = p.fecha;
            Tipoid = p.Tipoid;
            Nompaciente = p.Nombrepaciente;
            Nomdoc= p.Nombredoc;
            especialista = p.especialista;
            
            p.hora = q.hora;
            p.identificacionpaciente = q.identificacionpaciente;
            p.fecha = q.fecha;
            p.Tipoid = q.Tipoid;
            p.Nombrepaciente = q.Nombrepaciente;
            p.Nombredoc = q.Nombredoc;
            p.especialista = q.especialista;
            
            q.hora = hora;
            q.identificacionpaciente = idpaciente;
            q.fecha = fecha;
            q.Tipoid = Tipoid;
            q.Nombrepaciente = Nompaciente;
            q.Nombredoc = Nomdoc;
            q.especialista = especialista;
            
            p = p.sig;
            q = q.sig;
            
        }
        else
        {
            p = p.sig;
            q = q.sig;
        }
    }
    i++;
    
    }while(i<=getLongLista());
    i = 0;
    do
    {
        p = cab;
        nodo q = p.sig;
         while(p.sig!=null)
         {
            if(p.fecha.compareTo(q.fecha)> 0)
            {
                hora = p.hora;
                idpaciente= p.identificacionpaciente;
                fecha = p.fecha;
                Tipoid = p.Tipoid;
                Nompaciente = p.Nombrepaciente;
                Nomdoc= p.Nombredoc;
                especialista = p.especialista;
            
                p.hora = q.hora;
                p.identificacionpaciente = q.identificacionpaciente;
                p.fecha = q.fecha;
                p.Tipoid = q.Tipoid;
                p.Nombrepaciente = q.Nombrepaciente;
                p.Nombredoc = q.Nombredoc;
                p.especialista = q.especialista;
            
                q.hora = hora;
                q.identificacionpaciente = idpaciente;
                q.fecha = fecha;
                q.Tipoid = Tipoid;
                q.Nombrepaciente = Nompaciente;
                q.Nombredoc = Nomdoc;
                q.especialista = especialista;
            
                p = p.sig;
                q = q.sig;
            }
            else
            {
                p = p.sig;
                q = q.sig;
            }   
         }
        i++;
    }while(i<getLongLista());
    
  }
  void AggEND()
  {
    nodo info = Registro();
    if(cab==null)
    {
        cab = info;
        JOptionPane.showMessageDialog(null, "¡Elemento agregado al inicio!\n\t\t\t¡La lista ya no está vacía!");
       }
    else
    {
           nodo p = cab;
           while(p.sig!=null)
           {
               p = p.sig;
           }
           p.sig=info;
           info.ant = p;
        JOptionPane.showMessageDialog(null, "Elemento agregado al final!");
      }
       Antencion();
    } 
   
  void RetirarInfo()
  {
    int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la identificaión del paciente que se atendió: "));
        if(cab==null)
           JOptionPane.showMessageDialog(null, "¡¡¡LA LISTA ESTÁ VACÍA!!!");
          else
          {
            nodo p = BuscarId(id);
            if(p==null)
            JOptionPane.showMessageDialog(null, "¡¡¡EL PACIENTE NO FUE ENCONTRADO!!!");
            else
            {
                lista(p);
                if((p==cab)&&(cab.sig==null))
                {
                    cab = null;
                    JOptionPane.showMessageDialog(null, "¡¡PACIENTE RETIRADO CON EXITO!!, !!LA LISTA ESTÁ VACÍA!!");
                }
                else 
                    if((p==cab)&&(cab.sig!=null))
                    {
                     cab = cab.sig;
                     cab.ant=null;
                     p.sig=null;
                     p = null;
                     JOptionPane.showMessageDialog(null, "¡¡PACIENTE RETIRADO CON EXITO!!");  
                    }
                    else 
                        if(p.sig==null)
                        {
                         p.ant.sig= null;
                         p.ant = null;
                         p = null;
                         JOptionPane.showMessageDialog(null, "¡Paciente retirado de la lista!");
                        }
                        else 
                        {
                         p.ant.sig = p.sig;
                         p.sig.ant = p.ant;
                         p.sig = p.ant = null;
                         p = null;
                         JOptionPane.showMessageDialog(null, "¡Paciente retirado de la lista!");
                        }
            }
          }
  } 
   
void ordenDeAtencion()
{
String  cardio="Registro de consultas de cardiologo: \n\n", 
        otorrino = "Registro de consultas de otorrino: \n\n",
        gastro = "Registro de consultas de gastroenterologo: \n\n";
        nodo d = cab;
        while(d!=null)
        {
        if(d.especialista.equalsIgnoreCase("cardiologo"))
        {
            cardio+="Identificación del paciente: "+d.identificacionpaciente+" \n";
            cardio+="Tipo de identificación: "+d.Tipoid+" \n";
            cardio+="Nombre del paciente: "+d.Nombrepaciente+" \n";
            cardio+="Fecha de la consulta: " +d.fecha+" \n";
            cardio+="Doctor encargado: "+d.Nombredoc+" \n";
            cardio+="Hora de la consulta: "+d.hora+" \n";
            cardio+=" \n\n";
        }
        if(d.especialista.equalsIgnoreCase("otorrino"))
        {
            otorrino+="Identificación del paciente: "+d.identificacionpaciente+" \n";   
            otorrino+="Tipo de identificación: "+d.Tipoid+" \n";
            otorrino+="Nombre del paciente: "+d.Nombrepaciente+" \n";
            otorrino+="Fecha de la consulta: " +d.fecha+" \n";
            otorrino+="Doctor encargado: "+d.Nombredoc+" \n";    
            otorrino+="Hora de la consulta: "+d.hora+" \n";
            otorrino+=" \n\n";
        }
        if(d.especialista.equalsIgnoreCase("gastroenterologo"))
        {
            gastro+="Identificación del paciente: "+d.identificacionpaciente+" \n";    
            gastro+="Tipo de identificación: "+d.Tipoid+" \n";
            gastro+="Nombre del paciente: "+d.Nombrepaciente+" \n";
            gastro+="Fecha de la consulta: " +d.fecha+" \n";    
            gastro+="Doctor encargado: "+d.Nombredoc+" \n";    
            gastro+="Hora de la consulta: "+d.hora+" \n"; 
            gastro+=" \n\n";
        }
         d=d.sig;
        }
     JOptionPane.showMessageDialog(null, cardio);
     JOptionPane.showMessageDialog(null, otorrino);
     JOptionPane.showMessageDialog(null, gastro);     
}   
   
 void Informe()
 {
    String may ="";
    String aux="Informe de citas apartadas por especialidad: "+"\n";
           aux+="Cardiologo: "+Cardiologo()+" \n";
           aux+="Otorrino: "+Otorrino()+" \n";
           aux+="Gastroenterologo: "+Gastroenterologo()+" \n";
           if(Cardiologo()>Otorrino()&&Cardiologo()>Gastroenterologo())
           {
             may = " Cardiologo";
           }
           else
           {
            if(Cardiologo()<Otorrino()&&Otorrino()>Gastroenterologo())
               may = " Otorrino";
         
            else
            {
             if(Gastroenterologo()> Otorrino() && Gastroenterologo()>Cardiologo() )
                may = " Gastroenterologo";
         
            else 
            {
             if(Gastroenterologo()== Otorrino())
                may = "Gastroenterologo y Otorrino con el mismo número de citas ( "+Otorrino()+" )";
             else
             {
              if(Gastroenterologo()==Cardiologo())
                 may = "Gastroenterologo y Cardiologo con el mismo número de citas ( "+Cardiologo()+" )";
              else
              {
               if( Otorrino() == Cardiologo())
                  may = "Cardiologo y Otorrino con el mismo número de citas ( "+Cardiologo()+" )";
              }
             }
            }
           }
          }
           aux+="Especialidad con mayor citas: "+may+"\n";
           aux+="Total de citas: "+getLongLista()+" \n";
           JOptionPane.showMessageDialog(null, aux);
       }  
  
 void MostrarList()
 {
    nodo p = null;
    if(cab==null)
       JOptionPane.showMessageDialog(null, "¡¡¡LA LISTA ESTÁ VACIA!!!");
    else
    {
        p = cab;
        String aux ="";
        int c = 1;
        while(p!=null)
        {
            aux+="Registro de todas las consultas del día: \n\n";
            aux+="Persona número "+c + " en apartar cita\n";
            aux+="Identificación del paciente: "+p.identificacionpaciente+" \n";
            aux+="Tipo de identificación: "+p.Tipoid+" \n";
            aux+="Nombre del paciente: "+p.Nombrepaciente+" \n";
            aux+="Fecha de la consulta: " +p.fecha+" \n";
            aux+="Hora de la consulta: "+p.hora+" \n";
            aux+="Doctor asignado: "+p.Nombredoc+" \n";
            aux+="Especialidad: "+p.especialista+" \n";
            JOptionPane.showMessageDialog(null, aux);
            aux="";
            p = p.sig;
        }
    }
 }
 
 void lista(nodo p)
 {
        int id;
        String nompaciente, nomdoc, fecha, especialista, tipoid;
        float hora;
        
        id = p.identificacionpaciente;
        nompaciente = p.Nombrepaciente;
        nomdoc = p.Nombredoc;
        fecha = p.fecha;
        especialista = p.especialista;
        tipoid = p.Tipoid;
        hora = p.hora;
        
        clon q = new clon(id, hora, tipoid, nompaciente, nomdoc, fecha, especialista);
         
        if(cab2==null)
        {
            cab2 = q;
            JOptionPane.showMessageDialog(null, "!!Registro copiado!!");
        }
        else
        {
            clon a = cab2;
            while(a.sig!=null)
            {
                a= a.sig;
            }
            a.sig = q;
            JOptionPane.showMessageDialog(null, "!!Registro copiado!!");

        }
    }
 
 void mostrarR()
 {
    int c = 1;
    String aux = "Historial de registro";
    if (cab2 == null) 
    {
      JOptionPane.showMessageDialog(null, "¡¡¡REGISTRO VACIO!!!");
    } 
    else 
    {
      clon q = cab2;
      while (q != null) 
      {
        aux =c++ +" Paciente atendido";
        aux += "Identificación: " + q.identificacionpaciente + "\n";
        aux += "Tipo de identificación: " + q.Tipoid+ "\n";
        aux += "Nombre: " + q.Nombrepaciente + "\n";
        aux += "Fecha de la cita: " + q.fecha + "\n";
        aux += "Hora de la cita: " + q.hora + "\n";
        aux += "Nombre del medico que atendió: " + q.Nombredoc + "\n";
        aux += "Especialidad: " + q.especialista + "\n";
        JOptionPane.showMessageDialog(null, aux);
                
            aux ="";
            q = q.sig;
       }          
    }   
 }
   
}
