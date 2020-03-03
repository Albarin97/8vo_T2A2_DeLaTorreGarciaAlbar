

object ActividadVectores {
  def main(args: Array[String]): Unit = {
    
    val parcial1 = Array(100, 100, 99, 95, 100, 98)
    val parcial2 = Array(50, 100, 70, 70, 75, 0)
    val parcial3 = Array(85, 100, 70, 85, 50, 90)
    val parcial4 = Array(50, 100, 70, 20, 69, 60)
    
    val todo = Array(parcial1, parcial2, parcial3, parcial4)
    
    var cont = 0
    var contGen = 0
    var prom = 0
    for(e<-todo){
      for(x<-e){
        prom+=x
      }
      println("Promedio parcial "+(cont+1)+": "+(prom/6))
      cont+=1
      contGen+=prom
      prom=0
    }
    println("=========================================")
    var m1=0
    var m2=0
    var m3=0
    var m4=0
    var m5=0
    var m6=0
    
    for(e<-todo){
      m1+=e(0)
      m2+=e(1)
      m3+=e(2)
      m4+=e(3)
      m5+=e(4)
      m6+=e(5)
    }
    println("Promedio materia 1: "+(m1/4))
    println("Promedio materia 2: "+(m2/4))
    println("Promedio materia 3: "+(m3/4))
    println("Promedio materia 4: "+(m4/4))
    println("Promedio materia 5: "+(m5/4))
    println("Promedio materia 6: "+(m6/4))
    
    println("=========================================")
    
    println("Promedio General: "+(contGen/24))
    
    //////////////////////////////////////////////////////////////////////////////////
    println("//////////////////////////////////////////////////////////////////////////////////")
    
    val vector = new Array[Int](48)
    var horas = 0
    for(x<- 0 to 47){
      if(x%2==0){
        vector(x)=horas
        horas+=1
      }else{
        val r = scala.util.Random
        vector(x)=r.nextInt(50)
      }
    }
    
    var promHoras = 0
    var contH = 0
    for(x<- 0 to 47){
      if(vector(x)==25){
        println("Hora: "+vector(x-1)+" Temperatura: "+vector(x))
        promHoras+=vector(x-1)
        contH+=1
      }
    }
    if(promHoras!=0)println("Promedio de horas: "+(promHoras/contH))
    
    
  }//main
}