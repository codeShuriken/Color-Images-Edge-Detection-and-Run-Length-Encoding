import list.*;
public class Matrix {
	Pixel[][] pix;
	private final static int SIZE = 3; 
	
	public Matrix() {
		pix = new Pixel[SIZE][SIZE];
	}
	
	public Matrix(Pixel[][] pix) {
		this.pix = pix;
	}
	
	public Matrix product(int[][] b) {
		Matrix product = new Matrix();
		
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				product.pix[i][j] = pix[i][j].multiply(b[i][j]);
			}
		}
		
		return product;
	}
	
	public Pixel sum() {
		
		int r = 0, g = 0, b = 0;
		
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				r = (short)(r + pix[i][j].getRed());
				g = (short)(g + pix[i][j].getGreen());
				b = (short)(b + pix[i][j].getBlue());
			}
		}
		
		return new Pixel(r, g, b);
	}
	
	/*
	public String toString()
    {
        String matrix = "";
        for(int i=0; i < pix.length; i++)
        {
            for(int j=0; j < pix[0].length; j++)
            {
                matrix += " | " + pix[i][j];
            }
            matrix  +=  "\n";
        }
        return matrix;
    }
    */
	
}
