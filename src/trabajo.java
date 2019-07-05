import java.util.Scanner;
public class trabajo {

    public static void main(String[] args) {
          Scanner leer=new Scanner(System.in);
          boolean Acceso=false;
          boolean DobleAcceso=false;
          String TipoCliente, TipoProveedor;
          String Opcion="", ProductoEstrella="";          
          int ComprarNuevamenteC=0, ComprarNuevamenteV=0;  
          int ContarProductoV1=0, ContarProductoV2=0, ContarProductoV3=0, ContarProductoV4=0;
          int KilogramosV=0, KilogramosC=0;
          int NumeroCompras=0, NumeroVentas=0;
          int CodigoProductoV=0, CodigoProductoC=0;         
          double Efectivo=0.00;
          double DineroCaja=0.00;
          double CantidadMaxima=0.00;         
          double MasSubtotalV=0.00, SubtotalVenta=0.00, ImpuestoVenta=0.00, DescuentoVenta=0.00, TotalPagarV=0.00;          
          double TotalCompra=0.00;                   
          double ProductoEscogidoV=0.00, ProductoEscogidoC=0.00;          
          double VolumenCompras=0.00, VolumenVentas=0.00;
          double PromedioCompras=0.00, PromedioVentas=0.00;
          double Ganancia=0.00;
          double VentaMayor=0.00,CompraMayor=0.00;
          double DepositoBanco=0.00;
          
          do{
              System.out.println("\n ------------------------" 
                                +"\n|\" GRANOS BASICOS Y MAS \"|" 
                                +"\n|------------------------|" 
                                +"\n|    MENU PRINCIPAL      |"
                                +"\n|------------------------|" 
                                +"\n|1. Abrir Caja           |"
                                +"\n|2. Ventas               | "
                                +"\n|3. Compras              | "
                                +"\n|4. Reportes             |"
                                +"\n|5. Cierre de Caja       |"
                                +"\n|6. Salir del sistema    |"
                                +"\n ------------------------");
              System.out.print("Seleccione una opcion: ");
              Opcion=leer.next();
                switch(Opcion)
                {                    
                     case "1":        
                         Acceso=true;
                             if(DobleAcceso==false)
                             {
                              System.out.println("\n ------------------------"    
                                                +"\n|    INICIO DE JORNADA   |"
                                                +"\n|------------------------|" 
                                                +"\n|Ingrese la cantidad de  |"
                                                +"\n|dinero:                 |"
                                                +"\n ------------------------");
                              System.out.print("Lps. "); 
                              Efectivo=leer.nextDouble();
                              DineroCaja=DineroCaja+Efectivo;
                              System.out.println("Dinero cargado a la caja"
                                               + "\nHabilitadas compras|ventas\n");
                            }
                              else
                             {
                                  System.out.println("Dinero en caja:" +DineroCaja
                                                   + "\nHabilitadas compras|ventas\n");
                             }                          
                              break;
                //Empieza el caso 2
                      case "2": 
                               if(Acceso==true)
                               {                                
                               do{
                                  System.out.println("\n ------------------------"  
                                                    +"\n|        VENTAS          |"
                                                    +"\n|------------------------|" 
                                                    +"\n|Ingrese tipo de cliente |"
                                                    +"\n ------------------------"); 
                                  System.out.print("\"A\", \"B\" o \"C\": "); 
                                  TipoCliente=leer.next();
                                  TipoCliente=TipoCliente.toUpperCase();
                                    switch(TipoCliente)
                                    {
                   //Empieza el caso A                     
                                           case "A":      
                                                do{
                                                    do{
                                                        System.out.println("\n ------------------------" 
                                                                          +"\n|  DETALLE DE PRODUCTOS  |"
                                                                          +"\n|------------------------|"   
                                                                          +"\n|Codigo  Producto  Precio|"
                                                                          +"\n|  1     Azucar   Lps. 30|"
                                                                          +"\n|------------------------|"
                                                                          +"\n|Codigo  Producto  Precio|"
                                                                          +"\n|  2      Avena   Lps. 25|"
                                                                          +"\n|------------------------|"
                                                                          +"\n|Codigo  Producto  Precio|"
                                                                          +"\n|  3      Trigo   Lps. 32|"
                                                                          +"\n|------------------------|"
                                                                          +"\n|Codigo  Producto  Precio|"
                                                                          +"\n|  4      Maiz    Lps. 20|"
                                                                          +"\n|------------------------|"
                                                                          +"\n| Ingrese el codigo del  |"
                                                                          +"\n| producto que vendera   |"
                                                                          +"\n ------------------------");
                                                        System.out.print("1, 2, 3 o 4: ");                                                                                 
                                                        CodigoProductoV=leer.nextInt();  
                                                            switch(CodigoProductoV)
                                                            {                        
                                                                    case 1:
                                                                            ProductoEscogidoV=30;
                                                                            ContarProductoV1++;
                                                                            break;
                        
                                                                    case 2:    
                                                                            ProductoEscogidoV=25;
                                                                            ContarProductoV2++;
                                                                            break;
                       
                                                                    case 3:
                                                                            ProductoEscogidoV=32;
                                                                            ContarProductoV3++;
                                                                            break;
                       
                                                                    case 4:
                                                                            ProductoEscogidoV=20; 
                                                                            ContarProductoV4++;
                                                                            break;
                                                                    
                                                                    default:
                                                                            System.out.println("\033[31mCodigo no existe\033[30m");
                                                                            break;                                                                            
                                                            }                                                       
                                                    }while(CodigoProductoV!=1 &&CodigoProductoV!=2 &&CodigoProductoV!=3 && CodigoProductoV!=4); 
                                                           System.out.println("\n ------------------------" 
                                                                              +"\n|Ingrese la cantidad de  |"
                                                                              +"\n|kilogramos:             |");
                                                           System.out.println(" ------------------------"); 
                                                           KilogramosV=leer.nextInt();        
                                                           SubtotalVenta=KilogramosV*ProductoEscogidoV;
                                                           MasSubtotalV=MasSubtotalV+SubtotalVenta;
                                                           System.out.println("\n ------------------------" 
                                                                              +"\n|¿Comprar otro producto? |"
                                                                              +"\n|1.Si  2.No              |");
                                                           System.out.println(" ------------------------");             
                                                           ComprarNuevamenteV=leer.nextInt();
                                                }while(ComprarNuevamenteV==1);                                                   
                                            break;                                             
                    //Empieza el caso B
                                            case "B":
                                                do{
                                                    do{
                                                        System.out.println("\n ------------------------" 
                                                                          +"\n|  DETALLE DE PRODUCTOS  |"
                                                                          +"\n|------------------------|"   
                                                                          +"\n|Codigo  Producto  Precio|"
                                                                          +"\n|  1     Azucar   Lps. 30|"
                                                                          +"\n|------------------------|"
                                                                          +"\n|Codigo  Producto  Precio|"
                                                                          +"\n|  2      Avena   Lps. 25|"
                                                                          +"\n|------------------------|"
                                                                          +"\n|Codigo  Producto  Precio|"
                                                                          +"\n|  3      Trigo   Lps. 32|"
                                                                          +"\n|------------------------|"
                                                                          +"\n| Ingrese el codigo del  |"
                                                                          +"\n| producto que vendera   |"
                                                                          +"\n ------------------------");
                                                        System.out.print("1, 2, o 3 ");
                                                        CodigoProductoV=leer.nextInt();                    
                                                            switch(CodigoProductoV)
                                                            {                        
                                                                    case 1:
                                                                            ProductoEscogidoV=30;
                                                                            ContarProductoV1++;
                                                                            break;
                        
                                                                    case 2:    
                                                                            ProductoEscogidoV=25;
                                                                            ContarProductoV2++;
                                                                            break;
                       
                                                                    case 3:
                                                                            ProductoEscogidoV=32;
                                                                            ContarProductoV3++;
                                                                            break;
                       
                                                                    case 4:
                                                                            System.out.println("\033[31mNo puede comprar dicho producto\033[30m");
                                                                            break;   
                                                                            
                                                                    default:
                                                                            System.out.println("\033[31mCodigo no existe\033[30m");
                                                                            break;                                                                            
                                                            }                                                           
                                                    }while(CodigoProductoV!=1 &&CodigoProductoV!=2 &&CodigoProductoV!=3 && CodigoProductoV!=4);  
                                                           if(CodigoProductoV==1 || CodigoProductoV==2|| CodigoProductoV==3)
                                                           {
                                                               System.out.println("\n ------------------------" 
                                                                              +"\n|Ingrese la cantidad de  |"
                                                                              +"\n|kilogramos:             |");
                                                               System.out.println(" ------------------------"); 
                                                               KilogramosV=leer.nextInt();        
                                                               SubtotalVenta=KilogramosV*ProductoEscogidoV;
                                                               MasSubtotalV=MasSubtotalV+SubtotalVenta;
                                                               System.out.println("\n ------------------------" 
                                                                              +"\n|¿Comprar otro producto? |"
                                                                              +"\n|1.Si  2.No              |");
                                                               System.out.println(" ------------------------");
                                                               ComprarNuevamenteV=leer.nextInt();
                                                           }
                                                            else
                                                           {
                                                                System.out.println("\n ------------------------" 
                                                                              +"\n|¿Comprar otro producto? |"
                                                                              +"\n|1.Si  2.No              |");
                                                                System.out.println(" ------------------------");
                                                                ComprarNuevamenteV=leer.nextInt(); 
                                                           }                                                             
                                                }while(ComprarNuevamenteV==1);                                                                
                                            break;       
                    //Inicia el caso C
                                            case "C":
                                                do{
                                                    do{
                                                        System.out.println("\n ------------------------" 
                                                                          +"\n|  DETALLE DE PRODUCTOS  |"
                                                                          +"\n|------------------------|"   
                                                                          +"\n|Codigo  Producto  Precio|"
                                                                          +"\n|  4      Maiz    Lps. 20|"
                                                                          +"\n|------------------------|"
                                                                          +"\n| Ingrese el codigo del  |"
                                                                          +"\n| producto que vendera   |"
                                                                          +"\n ------------------------");
                                                        System.out.print("Solo 4: ");  
                                                        CodigoProductoV=leer.nextInt();                    
                                                            switch(CodigoProductoV)
                                                            {                        
                                                                    case 1:
                                                                            System.out.println("\033[31mNo puede comprar dicho producto\033[30m");
                                                                            break;
                        
                                                                    case 2:    
                                                                            System.out.println("\033[31mNo puede comprar dicho producto\033[30m");
                                                                            break;
                       
                                                                    case 3:
                                                                            System.out.println("\033[31mNo puede comprar dicho producto\033[30m");
                                                                            break;
                       
                                                                    case 4:
                                                                            ProductoEscogidoV=20;                       
                                                                            ContarProductoV4++;
                                                                            break;
                                                                            
                                                                    default:
                                                                            System.out.println("\033[31mCodigo no existe\033[30m");
                                                                            break;                                                                            
                                                            }                                                         
                                                        }while(CodigoProductoV!=1 &&CodigoProductoV!=2 &&CodigoProductoV!=3 && CodigoProductoV!=4);  
                                                              if(CodigoProductoV==4)
                                                              {
                                                                System.out.println("\n ------------------------" 
                                                                              +"\n|Ingrese la cantidad de  |"
                                                                              +"\n|kilogramos:             |");
                                                                System.out.println(" ------------------------"); 
                                                                KilogramosV=leer.nextInt();        
                                                                SubtotalVenta=KilogramosV*ProductoEscogidoV;
                                                                MasSubtotalV=MasSubtotalV+SubtotalVenta;
                                                                System.out.println("\n ------------------------" 
                                                                              +"\n|¿Comprar otro producto? |"
                                                                              +"\n|1.Si  2.No              |");
                                                                System.out.println(" ------------------------");
                                                                ComprarNuevamenteV=leer.nextInt();
                                                              }
                                                            else
                                                            {
                                                                System.out.println("\n ------------------------" 
                                                                              +"\n|¿Comprar otro producto? |"
                                                                              +"\n|1.Si  2.No              |");
                                                                System.out.println(" ------------------------");
                                                                ComprarNuevamenteV=leer.nextInt(); 
                                                            }    
                                                }while(ComprarNuevamenteV==1);                                                                
                                            break;
                                            
                                            default:
                                                    System.out.println("\033[31mCodigo de cliente no existe\033[30m");
                                                    break;
                                    }                
                                }while(TipoCliente!="A" && TipoCliente!="B" && TipoCliente!="C" && ComprarNuevamenteV!=2);
                               
                                if(ComprarNuevamenteV==2)
                                {
                                   if(SubtotalVenta>=1000)
                                    {
                                      DescuentoVenta=SubtotalVenta*0.05;
                                    }
                                   else if(SubtotalVenta>5000)
                                    {
                                      DescuentoVenta=SubtotalVenta*0.05;
                                    }
                                    else
                                    {
                                      DescuentoVenta=0.00;          
                                    }
                                }
                      ImpuestoVenta=MasSubtotalV*0.07;
                      TotalPagarV=MasSubtotalV-DescuentoVenta+ImpuestoVenta;
                      if(VentaMayor<TotalPagarV)
                      {
                      VentaMayor=TotalPagarV;
                      }
                      System.out.println("\n ------------------------" 
                                       +"\n El subtotal es: "+MasSubtotalV
                                       +"\n ------------------------" 
                                       + "\n El descuento es: "+DescuentoVenta
                                       +"\n ------------------------" 
                                       + "\n El impuesto es: "+ImpuestoVenta
                                       +"\n ------------------------"
                                       + "\n El total del cliente es: "+TotalPagarV
                                       +"\n ------------------------");
                      DineroCaja+=TotalPagarV; 
                      NumeroVentas++;
                      VolumenVentas=VolumenVentas+TotalPagarV; 
                      SubtotalVenta=0.00;             
                      MasSubtotalV=0.00;                                          
                               } 
                               else 
                               {
                                   System.out.println("\033[31mPrimero debe abrir caja\033[30m"); 
                               }
                                   break;
                    //Finaliza el caso 2 
                     case "3":                          
                                if(Acceso==true)
                                {
                                  do{  
                                  System.out.println("\n ------------------------"  
                                                    +"\n|        COMPRAS         |"
                                                    +"\n|------------------------|" 
                                                    +"\n|Ingrese el proveedor    |"
                                                    +"\n ------------------------"); 
                                  System.out.print("\"A\", \"B\" o \"C\": ");
                                  TipoProveedor=leer.next();
                                  TipoProveedor=TipoProveedor.toUpperCase();
                                    switch(TipoProveedor)
                                    {
                   //Empieza el caso A                     
                                           case "A":   
                                               do{
                                                      do{
                                                        System.out.println("\n ------------------------" 
                                                                          +"\n|PRODUCTOS DEL PROVEEDOR |"
                                                                          +"\n|------------------------|"   
                                                                          +"\n|Codigo  Producto  Precio|"
                                                                          +"\n|  1     Azucar   Lps. 25|"
                                                                          +"\n|------------------------|"
                                                                          +"\n|Codigo  Producto  Precio|"
                                                                          +"\n|  4      Maiz    Lps. 18|"
                                                                          +"\n|------------------------|"
                                                                          +"\n| Ingrese el codigo del  |"
                                                                          +"\n| producto que comprara  |"
                                                                          +"\n ------------------------");
                                                        System.out.print("1 o 4: "); 
                                                        CodigoProductoC=leer.nextInt();                    
                                                            switch(CodigoProductoC)
                                                            {                        
                                                                    case 1:
                                                                            ProductoEscogidoC=25;
                                                                            break;
                      
                                                                    case 2:    
                                                                            System.out.println("\033[31mEl proveedor no vende dicho producto\033[30m");
                                                                            break;
                       
                                                                    case 3:
                                                                            System.out.println("\033[31mEl proveedor no vende dicho producto\033[30m");
                                                                            break;
                       
                                                                    case 4:
                                                                            ProductoEscogidoC=18;                         
                                                                            break;
                                                                    default:
                                                                            System.out.println("\033[31mCodigo no existe\033[30m");
                                                                            break;                                                                            
                                                            }
                                                      }while(CodigoProductoC!=1 &&CodigoProductoC!=2 &&CodigoProductoC!=3 && CodigoProductoC!=4); 
                                                    if(CodigoProductoC==1 || CodigoProductoC==4)
                                                      {
                                                           System.out.println("\n ------------------------" 
                                                                              +"\n|Ingrese la cantidad de  |"
                                                                              +"\n|kilogramos:             |");
                                                           System.out.println(" ------------------------"); 
                                                           KilogramosC=leer.nextInt();        
                                                           TotalCompra=KilogramosC*ProductoEscogidoC;
                                                              if(DineroCaja>=TotalCompra)
                                                               {        
                                                                 DineroCaja=DineroCaja-TotalCompra;
                                                                 System.out.println("\n ------------------------" 
                                                                                   +"\n Total a pagar  "
                                                                                   +"\n al proveedor: "+TotalCompra 
                                                                                   +"\n ------------------------");
                                                                 ComprarNuevamenteC=2;
                                                               }
                                                                else 
                                                                   {
                                                                    System.out.println("\033[31mNo es posible realizar la compra"
                                                                                      +"\n\033[31mNo hay suficiente dinero en caja\033[30m");
                                                                   }                                                                             
                                                      }
                                                    else
                                                    {  
                                                       System.out.println("\n ------------------------" 
                                                                         +"\n|¿Comprar otro producto? |"
                                                                         +"\n|1.Si  2.No              |");
                                                       System.out.println(" ------------------------");
                                                       ComprarNuevamenteC=leer.nextInt();   
                                                    }
                                               }while(ComprarNuevamenteC==1);
                                            break;                                             
                    //Empieza el caso B
                                            case "B":
                                                do{
                                                       do{
                                                        System.out.println("\n ------------------------" 
                                                                          +"\n|PRODUCTOS DEL PROVEEDOR |"
                                                                          +"\n|------------------------|"   
                                                                          +"\n|Codigo  Producto  Precio|"
                                                                          +"\n|  2     Avena    Lps. 20|"
                                                                          +"\n|------------------------|"
                                                                          +"\n|Codigo  Producto  Precio|"
                                                                          +"\n|  3      Trigo   Lps. 30|"
                                                                          +"\n|------------------------|"
                                                                          +"\n| Ingrese el codigo del  |"
                                                                          +"\n| producto que comprara  |"
                                                                          +"\n ------------------------");
                                                        System.out.print("2 o 3: "); 
                                                        CodigoProductoC=leer.nextInt();                    
                                                            switch(CodigoProductoC)
                                                            {                        
                                                                    case 1:
                                                                            System.out.println("\033[31mEl proveedor no vende dicho producto\033[30m");
                                                                            break;
                      
                                                                    case 2:    
                                                                            ProductoEscogidoC=20;
                                                                            break;
                       
                                                                    case 3:
                                                                            ProductoEscogidoC=30;
                                                                            break;
                       
                                                                    case 4:
                                                                            System.out.println("\033[31mEl proveedor no vende dicho producto\033[30m");                        
                                                                            break;
                                                                    default:
                                                                            System.out.println("\033[31mCodigo no existe\033[30m");
                                                                            break;                                                                            
                                                            }
                                                       }while(CodigoProductoC!=1 &&CodigoProductoC!=2 &&CodigoProductoC!=3 && CodigoProductoC!=4);
                                                    if(CodigoProductoC==2 || CodigoProductoC==3)
                                                      {
                                                           System.out.println("\n ------------------------" 
                                                                              +"\n|Ingrese la cantidad de  |"
                                                                              +"\n|kilogramos:             |");
                                                           System.out.println(" ------------------------"); 
                                                           KilogramosC=leer.nextInt();        
                                                           TotalCompra=KilogramosC*ProductoEscogidoC;
                                                              if(DineroCaja>=TotalCompra)
                                                               {        
                                                                 DineroCaja=DineroCaja-TotalCompra;
                                                                 System.out.println("\n ------------------------" 
                                                                                   +"\n Total a pagar  "
                                                                                   +"\n al proveedor: "+TotalCompra 
                                                                                   +"\n ------------------------");
                                                                 ComprarNuevamenteC=2;
                                                               }
                                                                else 
                                                                   {
                                                                    System.out.println("\033[31mNo es posible realizar la compra al proveedor"
                                                                                      +"\n\033[31mNo hay suficiente dinero en caja\033[30m");
                                                                   }                                                                             
                                                      }
                                                    else
                                                    {   
                                                       System.out.println("\n ------------------------" 
                                                                         +"\n|¿Comprar otro producto? |"
                                                                         +"\n|1.Si  2.No              |");
                                                       System.out.println(" ------------------------");
                                                       ComprarNuevamenteC=leer.nextInt();   
                                                    }    
                                                }while(ComprarNuevamenteC==1);
                                            break;       
                    //Inicia el caso C
                                            case "C":
                                                do{
                                                     do{
                                                        System.out.println("\n ------------------------" 
                                                                          +"\n|PRODUCTOS DEL PROVEEDOR |"
                                                                          +"\n|------------------------|"   
                                                                          +"\n|Codigo  Producto  Precio|"
                                                                          +"\n|  2     Avena    Lps. 22|"
                                                                          +"\n|------------------------|"
                                                                          +"\n| Ingrese el codigo del  |"
                                                                          +"\n| producto que comprara  |"
                                                                          +"\n ------------------------");
                                                        System.out.print("Solo 2: "); 
                                                        CodigoProductoC=leer.nextInt();                    
                                                            switch(CodigoProductoC)
                                                            {                        
                                                                    case 1:
                                                                            System.out.println("\033[31mEl proveedor no vende dicho producto\033[30m");
                                                                            break;
                      
                                                                    case 2:    
                                                                            ProductoEscogidoC=22;
                                                                            break;
                       
                                                                    case 3:
                                                                            System.out.println("\033[31mEl proveedor no vende dicho producto\033[30m");
                                                                            break;
                       
                                                                    case 4:
                                                                            System.out.println("\033[31mEl proveedor no vende dicho producto\033[30m");
                                                                            break;
                                                                    default:
                                                                            System.out.println("\033[31mCodigo no existe\033[30m");
                                                                            break;                                                                            
                                                            }
                                                       }while(CodigoProductoC!=1 &&CodigoProductoC!=2 &&CodigoProductoC!=3 && CodigoProductoC!=4);
                                                    if(CodigoProductoC==2)
                                                      {
                                                           System.out.println("\n ------------------------" 
                                                                              +"\n|Ingrese la cantidad de  |"
                                                                              +"\n|kilogramos:             |");
                                                           System.out.println(" ------------------------"); 
                                                           KilogramosC=leer.nextInt();        
                                                           TotalCompra=KilogramosC*ProductoEscogidoC;                                                             
                                                              if(DineroCaja>=TotalCompra)
                                                               {        
                                                                 DineroCaja=DineroCaja-TotalCompra;
                                                                 System.out.println("\n ------------------------" 
                                                                                   +"\n Total a pagar  "
                                                                                   +"\n al proveedor: "+TotalCompra 
                                                                                   +"\n ------------------------");
                                                                 ComprarNuevamenteC=2;
                                                               }
                                                                else 
                                                                   {
                                                                    System.out.println("\033[31mNo es posible realizar la compra al proveedor"
                                                                                      +"\n\033[31mNo hay suficiente dinero en caja\033[30m");
                                                                   }                                                                             
                                                      }
                                                    else
                                                    {   
                                                       System.out.println("\n ------------------------" 
                                                                         +"\n|¿Comprar otro producto? |"
                                                                         +"\n|1.Si  2.No              |");
                                                       System.out.println(" ------------------------");
                                                       ComprarNuevamenteC=leer.nextInt(); 
                                                    }
                                                }while(ComprarNuevamenteC==1);
                                            break;
                                            
                                            default:
                                                    System.out.println("\033[31mCodigo de proveedor no existe\033[30m");
                                                    break;
                                       }                                  
                                    }while(TipoProveedor!="A" && TipoProveedor!="B" && TipoProveedor!="C" &&ComprarNuevamenteC!=2);
                                    if(CompraMayor<TotalCompra)
                                       {
                                        CompraMayor=TotalCompra;
                                       }
                                      NumeroCompras++;
                                     VolumenCompras=VolumenCompras+TotalCompra; 
                                }
                                else 
                                {
                                     System.out.println("\033[31mPrimero debe abrir caja\033[30m");
                                }
                                 break;
                                         
                     case "4":
                         if(Acceso==true)
                         {
                            Ganancia=VolumenVentas-VolumenCompras;
                            PromedioCompras=VolumenCompras/NumeroCompras;
                            PromedioVentas=VolumenVentas/NumeroVentas;
                            System.out.println("\n ------------------------"         
                                              +"\n|REPORTE DE TRANSACCIONES|"
                                              +"\n|------------------------|"   
                                              +"\n| \"GRANOS BASICOS Y MAS\" |"
                                              +"\n ------------------------ "  
                                              +"\n Cantidad en caja Lps."+DineroCaja
                                              +"\n ------------------------"  
                                              +"\n Numero de compras: "+NumeroCompras
                                              +"\n ------------------------"  
                                              +"\n Numero de ventas: "+NumeroVentas
                                              +"\n ------------------------"  
                                              +"\n Volumen de compras: "+VolumenCompras
                                              +"\n ------------------------"  
                                              +"\n Volumen de ventas: "+VolumenVentas
                                              +"\n ------------------------"  
                                              +"\n Ganacias del dia: "+Ganancia   
                                              +"\n ------------------------"  
                                              +"\n Promedio de compras: "+PromedioCompras  
                                              +"\n ------------------------"  
                                              +"\n Promedio de ventas: "+PromedioVentas
                                              +"\n ------------------------"  
                                              +"\n La venta mayor fue: "+VentaMayor
                                              +"\n ------------------------"  
                                              +"\n La compra mayor fue: "+CompraMayor
                                              +"\n ------------------------");
                                if(ContarProductoV1>ContarProductoV2 && ContarProductoV1>ContarProductoV3 
                                   &&ContarProductoV1>ContarProductoV4)
                                {
                                  ProductoEstrella="\n  1. Azucar"
                                                   +"\n ------------------------";
                                }
                                else if((ContarProductoV2>ContarProductoV1 && ContarProductoV2>ContarProductoV3 
                                        &&ContarProductoV2>ContarProductoV4))
                                {
                                  ProductoEstrella="\n  2. Avena"
                                                   +"\n ------------------------";
                                }   
                                 else if((ContarProductoV3>ContarProductoV1 && ContarProductoV3>ContarProductoV2 
                                         &&ContarProductoV3>ContarProductoV4))
                                {
                                  ProductoEstrella="\n  3. Trigo"
                                                   +"\n ------------------------";
                                }   
                                else if((ContarProductoV4>ContarProductoV1 && ContarProductoV4>ContarProductoV2 
                                        &&ContarProductoV4>ContarProductoV3))
                                {
                                  ProductoEstrella="\n  4. Maiz"
                                                   +"\n ------------------------";
                                }  
                                else
                                {
                                    
                                    ProductoEstrella="\n Hay 0 ventas o mas de " 
                                                    +"\n dos productos estrellas"
                                                    +"\n ------------------------";  
                                }
                            System.out.println("    Producto estrella: "+ ProductoEstrella);
                         }
                         else
                         {
                         System.out.println("\033[31mPrimero debe abrir caja\033[30m");
                         }   
                         break;
                     case "5":    
                              if(Acceso==true)
                              {          
                                System.out.println("\n ------------------------"  
                                                 + "\n|       CIERRE DE CAJA   |" 
                                                 + "\n ------------------------"    
                                                 + "\n Las ganacias del dia: "+Ganancia
                                                 + "\n ------------------------" 
                                                 +"\n El dinero en caja restante: "+DineroCaja
                                                 + "\n ------------------------" );
                                  do{
                                    System.out.println("\n ------------------------"  
                                                      +"\n |¿Cuanto dinero desea  |"
                                                      +"\n |depositar al banco?   |"
                                                      +"\n ------------------------");  
                                    DepositoBanco=leer.nextDouble();
                                    CantidadMaxima=DineroCaja*0.60;
                                      if(DepositoBanco<=CantidadMaxima)
                                       {
                                         DineroCaja=DineroCaja-DepositoBanco;
                                         System.out.println("\n ------------------------"         
                                                           +"\n Quedan en caja:" + DineroCaja
                                                           +"\n ------------------------"
                                                           +"\n Se finalizo la jornada:" );
                                         Acceso=false;
                                         DobleAcceso=true;
                                         ContarProductoV1=0;
                                         ContarProductoV2=0; 
                                         ContarProductoV3=0; 
                                         ContarProductoV4=0;
                                         NumeroCompras=0;
                                         NumeroVentas=0;
                                         VolumenCompras=0.00; 
                                         VolumenVentas=0.00;
                                         PromedioCompras=0.00;
                                         PromedioVentas=0.00;
                                         VentaMayor=0.0;
                                         CompraMayor=0.00;
                                       }
                                       else
                                       {
                                         System.out.println("\033[31mNo puede guardar mas del 60% del efectivo al banco\033[30m");                            
                                       } 
                                    }while(DepositoBanco>CantidadMaxima);
                                }    
                            else
                            {
                                System.out.println("\033[31mPrimero debe abrir caja\033[30m");
                            }
                         break;
                         
                     case "6":
                              System.out.println("Trabajo finalizado con exito");
                              System.exit(0);                         
                         break;
                         
              default:
               System.out.println("\033[31mIngrese una opcion correcta\n\033[30m");
              break;
               }         
          }while(true);         
  }
}