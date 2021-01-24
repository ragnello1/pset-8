public class ProblemSet8 {
    public boolean common(int[] a, int[] b) {
        if (a != null && b != null && a.length != 0 && b.length != 0){
            return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
        }
        return false;
    }

    public int[] middleman(int[] a, int[] b) {
        if (a != null && b != null && a.length % 2 == 1 && b.length % 2 == 1){
            int aHalf = a.length/2;
            int bHalf = b.length/2;
            int[] ints = {a[aHalf], b[bHalf]};
            return ints;
        }
        return null;
    }

    public int[] bigger(int[] a, int[] b) {
        int aSum = 0;
        int bSum = 0;
        if (a != null && b != null){
            for(int i = 0; i < a.length; i++){
                aSum += a[i];
            }
            for (int j = 0; j < b.length; j++){
                bSum += b[j];
            }
            if(aSum >= bSum){
                return a;
            } else {
                return b;
            }
        }
        return null;
    }

    public int[] doubleMiddle(int[] a, int[] b) {
        if(a != null && b != null && a.length % 2 == 0 && b.length % 2 == 0 && a.length > 0 && b.length > 0){
            int[] doubles = {a[a.length/2-1], a[a.length/2], b[b.length/2-1], b[b.length/2]};
            return doubles;
        }
        return null;
    }

    public int[] swapMe(int[] a) {
        if(a != null){
            if (a.length >= 2){
                int first = a[0];
                a[0] = a[a.length - 1];
                a[a.length - 1] = first;
            }
            return a;
        }
        return null;
    }

    public int[] threePoint(int[] a) {
        if (a != null && a.length % 2 == 1){
            int[] prong = {a[0], a[a.length/2], a[a.length - 1]};
            return prong;
        }
        return null;
    }

    public int headHoncho(int[] a) {
        int max = -1;
        if(a != null && a.length > 0){
            for(int i = 0; i < a.length; i++){
                if(a[i] < 0) {
                    return max;
                }
                if(a[i] > max) {
                    max = a[i];
                }
            }
            return max;
        }
        return max;
    }

    public boolean tippingPoint(int[] a, int threshold) {
        int sum = 0;
        if(a != null){
            for(int i = 0; i < a.length; i++){
                sum += a[i];
            }
            return sum > threshold;
        }
        return false;
    }

    public String halfway(int[] a) {
        int leftHalf = 0;
        int rightHalf = 0;
        if(a != null && a.length % 2 == 0 && a.length > 0){
            for(int i = 0; i <= a.length/2 - 1; i++){
                leftHalf += a[i];
            }
            for(int j = a.length/2; j <= a.length - 1; j++){
                rightHalf += a[j];
            }
            if(leftHalf > rightHalf){
                return "LEFT";
            } else {
                return "RIGHT";
            }
        }
        return null;
    }

    public int[] sequential(int[] a, int[] b) {
        int[] three = new int[3];
        if(a != null && b != null && a.length + b.length >= 3){
            int x = 0;
            for(int i = 0; i < 3; i++){
                if(i < a.length){
                    three[i] = a[i];
                } else {
                    three[i] = b[x];
                    x++;
                }
            }
            return three;
        }
        return null;
    }
}