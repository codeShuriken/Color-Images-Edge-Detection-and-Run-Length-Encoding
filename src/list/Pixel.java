package list;

public class Pixel {
	private short red;
	private short green;
	private short blue;
	
	public Pixel(int red, int green, int blue) {
		this.red = (short)red;
		this.green = (short)green;
		this.blue = (short)blue;
	}
	
	public Pixel() {
		this(0, 0, 0);
	}
	
	public short getRed() {
		return this.red;
	}
	
	public short getGreen() {
		return this.green;
	}
	
	public short getBlue() {
		return this.blue;
	}
	
	public String toString() {
		return red + ", " + green + ", " + blue;
	}
	
	public boolean equals(Pixel pix) {
		return ((this.red == pix.red) && (this.green == pix.green)
				&& (this.blue == pix.blue));
	}
	
	public Pixel multiply(int x) {
		Pixel pix = new Pixel();
		pix.red = (short)(x * red);
		pix.green = (short)(x * green);
		pix.blue = (short)(x * blue);
		
		return pix;
	}
	
	public int squaredSum() {
		double sum = Math.pow(red, 2) + Math.pow(green, 2) + Math.pow(blue, 2);
		return (int)sum;
	}
	
	public void setRed(short r) {
		this.red = r;
	}
	
	public void setGreen(short g) {
		this.green = g;
	}
	
	public void setBlue(short b) {
		this.blue = b;		
	}

	
	
	
	
}