public class EjerciciosEnLinea {

//Array2: Retorna verdadero si en el arreglo no hay ni 1's ni 3's.
    public boolean lucky13(int[] nums) {
        boolean cond = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3) {
                cond = false;
                break;
            }
        }
        return cond;
    }

//Array2: Retorna verdadero el número de 2's en el arreglo siman 8.
    public boolean sum28(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                sum += nums[i];
            }
        }
        return (sum == 8);
    }

//Array2: Retorna verdadero si el número de 1's en el arreglo es mayor al
//numero de 4's
    public boolean more14(int[] nums) {
        int cont1 = 0;
        int cont4 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                cont1++;
            }
            if (nums[i] == 4) {
                cont4++;
            }
        }
        return cont1 > cont4;
    }

//Array2: Dado un int n retorna un arreglo de tamaño n con los números del 0 
//hasta n-1
    public int[] fizzArray(int n) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
                nums[i] = i;
        }
        return nums;
    }

//Array2: Retorna verdadero si los ints del arreglo son solo 1's y 4's
    public boolean only14(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1 && nums[i] != 4) {
                return false;
            }
        }
        return true;
    }

//Array3: Retorna el número máximo de elementos entre los números iguales
//mas alejados incluyéndolos.
    public int maxSpan(int[] nums) {
        int i = 0;
        int mayor = 0;
        while (i < nums.length) {
            int j = nums.length - 1;
            while (j > i) {
                if (nums[j] == nums[i]) {
                    break;
                }
                j--;
            }
            if (mayor < (j - i) + 1) {
                mayor = (j - i) + 1;
            }
            i++;
        }
        return mayor;
    }

//Array3: Dado un arreglo de enteros, devuelve un arreglo, tal que después de
//cada 3 haya un 4 que se cambia de lugar con el número que está inmediatamente
//después del 3. Debe de haber un 3 antes de cualquier 4 y no puede mover los 3.
    public int[] fix34(int[] nums) {
        int temp;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == 4 && nums[j - 1] != 3) {
                        temp = nums[i + 1];
                        nums[i + 1] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
        }
        return nums;
    }

//Array3: Dado un arreglo de enteros, devuelve un arreglo, tal que después de
//cada 4 haya un 5 que se cambia de lugar con el número que está inmediatamente
//después del 4. Los 5 pueden estar en cualquier posición. No puede mover los 4.
    public int[] fix45(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 5 && i == 0 || nums[i] == 5 && nums[i - 1] != 4) {
                int p5 = i;
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == 4 && nums[j + 1] != 5) {
                        int a = nums[j + 1];
                        nums[j + 1] = 5;
                        nums[p5] = a;
                        break;
                    }
                }
            }
        }
        return nums;
    }

//Array3: Retorna verdadero si el arreglo se puede partir en dos partes tal que,
//la suma de cada partición sea igual.    
    public boolean canBalance(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum += nums[j];
            }
            for (int k = i; k < nums.length; k++) {
                sum -= nums[k];
            }
            if (sum == 0) {
                return true;
            }
        }
        return false;
    }
}
