package com.sanjay.Problems;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Recursive {

    static char[][] name = new char[62][5]; // A-Z, a-z and 0-9 total 62 characters and 4 hidden positions

    public static void main(String[] args) {
        for (int i = 0; i < 62; i++) {
            try {
                if (i < 10) {
                    name[i][0] = (char) (i + 48); // 0 ASCII value 48 after these numbers i=10
                    name[i][1] = (char) (i + 48); // 0,1,2,3 number of hidden positions
                    name[i][2] = (char) (i + 48);
                    name[i][3] = (char) (i + 48);
                    name[i][4] = (char) (i + 48);
                } else if (i < 36) {
                    name[i][0] = (char) (i + 55); // A ASCII value 65 after these alphabets i=36
                    name[i][1] = (char) (i + 55);
                    name[i][2] = (char) (i + 55);
                    name[i][3] = (char) (i + 55);
                    name[i][4] = (char) (i + 55);
                } else {
                    name[i][0] = (char) (i + 61); // a ASCII value 97
                    name[i][1] = (char) (i + 61);
                    name[i][2] = (char) (i + 61);
                    name[i][3] = (char) (i + 61);
                    name[i][4] = (char) (i + 61);
                }

            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        findHashCode(name);
    }

    public static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

    static void findHashCode(char[][] test) {

        try {
            String name = "ZAM"; // Intitial String
            String name1 = "d0a26218b4ad3c4c7b93a3f1b94d7687006a0b65ee03956f24f6dfb5d";
            int i, j, k, l1, m;
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            for (i = 0; i < 62; i++) {
                for (j = 0; j < 62; j++) {
                    for (k = 0; k < 62; k++) {
                        for (l1 = 0; l1 < 62; l1++) {
                            for (m = 0; m < 62; m++) {
                                name = name + "" + test[(m + l1 + k + j + i) % 62][4] + ""
                                        + test[(l1 + k + j + i) % 62][3]
                                        + "" + test[(k + j + i) % 62][2] + ""
                                        + test[(j + i) % 62][1] + "" + test[i][0];
                                byte[] result = md.digest(name.getBytes());
                                if (bytesToHex(result).compareTo(name1) == 0) {
                                    System.out.println("test is success" + name);
                                    System.out.println(bytesToHex(result) + "\n" + name1);
                                    break;
                                }
                                System.out.println(test[(l1 + k + j + i + m) % 62][4] + " "
                                        + test[(l1 + k + j + i) % 62][3] + " " + test[(k + j + i) % 62][1] + "  "
                                        + test[(j + i) % 62][1] + "  " + test[i][0]);
                                name = "ZAM";
                            }
                            if (m != 62) {
                                break;
                            }
                        }
                        if (l1 != 62) {
                            break;
                        }
                    }

                    if (k != 62) {
                        break;
                    }
                }
                if (j != 62) {
                    break;
                }
            }
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalArgumentException(e);
        }

    }
}