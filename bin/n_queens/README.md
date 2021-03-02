# Recusrion
SCF 

## Recursion

### Assignment 4

Note : Use concepts of Recursion for completing assignments. Also write JUnit test cases for below problems.

#### Question 3

Implement N Queens Problem using Recursion

The N Queen is the problem of placing N chess queens on an N×N chessboard so that no two queens attack each other. (Thus, a solution requires that no two queens share the same row, column, or diagonal)

Boolean  nQueen(int[][], int startRow, int dimensionOfMatrix);

int [][] board = new int [][] {
              { 0,  0,  0,  0},
              { 0,  0,  0,  0},
              { 0,  0,  0,  0},
              { 0,  0,  0,  0} 
};
Boolean result = nQueen(board , 0, 4);
where the result should be true and the board should have following content. 

Following is a solution for the 4 Queen problem.	

The expected output is a binary matrix which has 1s for the blocks where queens are placed. For example, the following is the output matrix for above 4 queen solution.
              { 0,  1,  0,  0}
              { 0,  0,  0,  1}
   	          { 1,  0,  0,  0}
              { 0,  0,  1,  0}
