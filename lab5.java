package com.smvitm.cnlab;
import java.util.Scanner;
public class BellmanDemoFinal {
static Scanner in = new Scanner(System.in);
public static void main(String [] args){
int V, E=1, chckNegative=0;
int w[][]= new int[20][20];
int edge[][] = new int[50][2];
System.out.println("Enter the no of vertices");
V= in.nextInt();
System.out.println("Enter the weight matrix");
for (int i=1;i <= V; i++)
for (int j=1;j <= V; j++){
w[i][j]= in.nextInt();
if(w[i][j] != 0){
edge[E][0] = i;
edge[E++][1]=j;
}}
chckNegative = bellmanFord(w, V, E, edge);
if(chckNegative==1)
System.out.println("\n No negative weight cycle \n");
else
System.out.println("\n Negative weight cycle exists \n");
}
public static int bellmanFord(int w[][], int V, int E, int edge[][]){
int u, v, S, flag =1;
int distance[] = new int[20];
int parent[]=new int[20];
/* Assign the distance of all the vertices to 999 */
for (int i=1; i <= V; i++){
int parent[] = new int[20];
/* Assign the distance of all the vertices to 999 */
for (int i=1; i <= V; i++){
distance[i]=999;
parent[i] =- 1;
}
System.out.printin("Enter the source vertex");
S=in.nextInt();
/* Assign the distance of source vertex to 0 */
distance[S]=0;
/* Relax each edge for V-1 times */
for (int i=1; i <= V-1; i++)
{
for (int k=1; k <= E; k++)
{
u =edge[k][0];
v=edge[k][1];
/* Relaxing each edge */
if (distance[u] + w[u][v] <distance[v])
{
distance[v] = distance[u] + w[u][v];
parent[v] =u;
}}
/* Relax all the edges one more time to check for negative weight cycle */
for (int k=1; k <= E; k++)
{
u = edge[k][0];
v=edge[k][1];
if (distance[u] + w[u][v] < distance[v])
flag=0;
}

if (flag==1)
for (int i=1;i <= V; i++)
System.out.println("Vertex"+i+"->cost="+distance[i] +"parent="+(parent[i]));
return flag;
}}
