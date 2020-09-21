// keyword `class` begins class definition for class named Percolation

public class Percolation {
  private boolean[][] grid;
  private int numOpen;


  // creates n-by-n grid, with all sites initially blocked
  public Percolation(int n) {
    if (n <= 0) {
      throw new IllegalArgumentException("n <= 0");
    }
    grid = new boolean[n][n];
    numOpen = 0;
  }

  // opens the site (row, col) if it is not open already
  public void open(int row, int col) {
    if (grid[row][col] == false) {
      grid[row][col] = true;
    }
  }

  // is the site (row, col) open?
  public boolean isOpen(int row, int col)

  // is the site (row, col) full?
  public boolean isFull(int row, int col)

  // returns the number of open sites
  public int numberOfOpenSites()

  // does the system percolate?
  public boolean percolates()

  // test client (optional)
  public static void main(String[] args)
}