package Praktikum7;

public class TokoSerbaAda {

        private String[][] barang = {
            {
                "a001", "a002", "a003", "a004", "a005"
            },
            {
                "Pensil", "Pulpen", "Buku", "Tas", "Binder"
            }
        };
        
        private int[] hargaBarang = {2000, 3000, 5000, 30000, 25000};
        
        public String[][] getBarang(){
            return this.barang;
        }
        
        public int[] getHargaBarang(){
            return this.hargaBarang;
        }
    }