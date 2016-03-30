package qqq;


public interface Iterator {
	public boolean hasNext();
	public Object next();
	public Object next(int cur);
	public boolean hasPrevious();
	public Object previous();
	public int getPosition();
	public void setPosition();
	public int getNext(int c);
	public int getPos();
	public void update(Object ob, int pos);

}
