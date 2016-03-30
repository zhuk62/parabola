package www;

class DoubleLinkedList

{

public node first;

public node last;


DoubleLinkedList()

{

first=new node();

first.next=null;

first.prev=null;

last=first;

}

void add (int v)

{


node temp=new node();

temp.x=v;

temp.next=null;


last.next=temp;

temp.prev=last;

last=temp;

}

void insert(int p,int v)

{

node ptr=first,temp;


for(int i=1;i<=p-1;i++)

ptr=ptr.next;


if(ptr.next==null)

add(v);


else

{

temp=new node();

temp.x=v;

temp.next=ptr.next;

ptr.next.prev=temp;

ptr.next=temp;

temp.prev=ptr;

}

}



void show()

{

System.out.println("\nList Elements:Left to Right");

for(node ptr=first.next;ptr!=null;ptr=ptr.next)

System.out.print("\t"+ptr.x);


System.out.println("\nList Elements:Right to Left");

for(node ptr=last;ptr.prev!=null;ptr=ptr.prev)

System.out.print("\t"+ptr.x);

}

}