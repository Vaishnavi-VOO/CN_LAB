//4. Develop a program to implement a sliding window protocol in the data link layer.

package com.smvitm.cnlab;
import java.util.Arrays;
public class Sliding WindowProtocol {
private int windowSize;
private int[] frames;
private boolean[] ack;
public Sliding WindowProtocol(int windowSize, int frameCount) {
this.windowSize = windowSize;
this.frames =new int[frameCount];
this.ack = new boolean[frameCount];
for (int i=0; i < frameCount; i++) {
frames[i]=i;
ack[i] = false;

public void sendFrames() {
int sendIndex = 0;
while (sendIndex < frames.length) {
for (int i=0;i<windowSize && (sendIndex + i) < frames.length;

i++) {

System.out.println("Sending frame: "+ frames[sendIndex + i]);

i++) {

for (int i=0; i< windowSize && (sendIndex + i) < frames.length;
ack[sendIndex + i] =receiveAck(sendIndex + i);

while (sendIndex<frames.length && ack[sendIndex])
sendIndex++;
while (sendIndex < frames.length && ack[sendIndex]) {
sendIndex++;

private boolean receiveAck(int frame) {
// Simulate acknowledgment reception
System.out.println("Receiving ack for frame: "+ frame);
return true; // Assume ack is always received for simplicity

public static void main(String[] args) {
int windowSize =4;
int frameCount=10;
Sliding WindowProtocol swp = new
Sliding WindowProtocol(windowSize, frameCount);
swp.sendFrames();
