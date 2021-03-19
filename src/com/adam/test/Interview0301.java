package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/23 14:25
 * version: 1.0.0
 */
public class Interview0301 {
    public static void main(String[] args) {
        TripleInOne tripleInOne = new TripleInOne(2);
        tripleInOne.push(0, 1);
        tripleInOne.push(0, 2);
        tripleInOne.push(0, 3);
        tripleInOne.pop(0);
        tripleInOne.pop(0);
        tripleInOne.pop(0);
        tripleInOne.peek(0);
    }

    static class TripleInOne {
        private int posOne;
        private int posTwo;
        private int posThree;
        private int[] stackOne;
        private int[] stackTwo;
        private int[] stackThree;
        private int stackSize;

        public TripleInOne(int stackSize) {
            this.stackSize = stackSize;
            posOne = -1;
            posTwo = -1;
            posThree = -1;
            stackOne = new int[stackSize];
            stackTwo = new int[stackSize];
            stackThree = new int[stackSize];
        }

        public void push(int stackNum, int value) {
            if (stackNum == 0) {
                if (posOne < stackSize - 1) {
                    stackOne[++posOne] = value;
                }
            } else if (stackNum == 1) {
                if (posTwo < stackSize - 1) {
                    stackTwo[++posTwo] = value;
                }
            } else {
                if (posThree < stackSize - 1) {
                    stackThree[++posThree] = value;
                }
            }
        }

        public int pop(int stackNum) {
            if (stackNum == 0) {
                if (posOne >= 0) {
                    return stackOne[posOne--];
                } else {
                    return -1;
                }
            } else if (stackNum == 1) {
                if (posTwo >= 0) {
                    return stackTwo[posTwo--];
                } else {
                    return -1;
                }
            } else {
                if (posThree >= 0) {
                    return stackThree[posThree--];
                } else {
                    return -1;
                }
            }
        }

        public int peek(int stackNum) {
            if (stackNum == 0) {
                if(posOne >= 0) {
                    return stackOne[posOne];
                }else {
                    return -1;
                }
            } else if (stackNum == 1) {
                if(posTwo >= 0) {
                    return stackTwo[posTwo];
                }else {
                     return -1;
                }
            } else {
                if(posThree >= 0) {
                    return stackThree[posThree];
                }else{
                    return -1;
                }
            }
        }

        public boolean isEmpty(int stackNum) {
            if (stackNum == 0) {
                return posOne == -1;
            } else if (stackNum == 1) {
                return posTwo == -1;
            } else {
                return posThree == -1;
            }
        }
    }
}
