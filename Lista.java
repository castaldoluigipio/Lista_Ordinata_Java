public class Lista {
    private Nodo head;
    private int counter;
    
    public void Lista(){
    this.head=null;
    this.counter=0 ;
}

public void stampa(){
    Nodo n=this.head ;

    System.out.printf("[%d]",this.counter);

    while(n!=null){
        System.out.printf("%d",n.val);
        n=n.next;
    }
    System.out.printf("NULL \n");
}

public void inserisci(int val){
	
	Nodo n=this.head ;
        Nodo v=null;

        Nodo a=new Nodo(val);
   
    while(n!=null && n.val<val) {
        v=n;
        n=n.next;
    }

    if (v==null ) {
        a.next =this.head ;
        this.head=a;
    }else{
        v.next=a;
        a.next=n;
    }

    this.counter ++;
}

public void rimuovi(int val){
    Nodo n=this.head;
    Nodo v=null;
    Nodo a=null;

    while (n!=null && n.val<val){
        v=n;
        n=n.next ;
    }

    if (n==null){
        System.out.printf("Elemento %d non trovato \n",val);
        return ;
    }

        System.out.printf("Elemento %d trovato \n",val);
      this.counter --;

    if(v==null){
        System.out.printf ("L'elemento da eliminare e' in testa \n");
        
        a=this.head ;           
        this.head=this.head.next ;             
        return ;
    }

    System.out.printf("L'elemento da eliminare non e' in testa \n");
    v.next=v.next.next;
}  
}
