package Utilidades;

import EjercicioConcesionario.Empresas.Concesionario;
import EjercicioConcesionario.Vehiculos.Vehiculo;

public class AlgoritmosOrdenación {

    /*
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

     */
//Ordenacion bubble sort por marcas
    public static void bubbleSortMarca(Concesionario miConcesionario) {
        int n = miConcesionario.vehiculosConcesionario.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                Vehiculo aux0=miConcesionario.vehiculosConcesionario.get(j);
                Vehiculo aux1=miConcesionario.vehiculosConcesionario.get(j+1);


                if ( aux0.getMarca().compareToIgnoreCase(aux1.getMarca())>0 ) {
                    Vehiculo temp = miConcesionario.vehiculosConcesionario.get(j);
                    miConcesionario.vehiculosConcesionario.set(j,miConcesionario.vehiculosConcesionario.get(j+1));
                    miConcesionario.vehiculosConcesionario.set((j+1),temp);
                }
            }
        }
    }

    public static void bubbleSortPrecio(Concesionario miConcesionario) {
        int n = miConcesionario.vehiculosConcesionario.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                Vehiculo aux0=miConcesionario.vehiculosConcesionario.get(j);
                Vehiculo aux1=miConcesionario.vehiculosConcesionario.get(j+1);


                if ( aux0.getPrecio()>aux1.getPrecio() ) {
                    Vehiculo temp = miConcesionario.vehiculosConcesionario.get(j);
                    miConcesionario.vehiculosConcesionario.set(j,miConcesionario.vehiculosConcesionario.get(j+1));
                    miConcesionario.vehiculosConcesionario.set((j+1),temp);
                }
            }
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    //Estos dos metodos de debajo trabajan conjuntamente

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

    }
}
