static int binarysc(int[] a, int low, int high, int key) {
        // initially we pass low as 0 and high as (a.length - 1) and key is the element we want to search
        int mid;
        if (high >= low) {
            mid = (low + high) / 2;
            if (a[mid] == key) {
                return mid;  // if key is equal to mid element we return the index of mid element

            }

// if key is less than middle element then we just search in lower half subarray and neglect the upper part
            else if (a[mid] < key) {
                return binarysc(a, mid + 1, high, key);
            }
            // if key is greater than middle element then we just search in upper half of list
            else {
                return binarysc(a, low, mid - 1, key);
            }
        }
        return -1;           // if element is not present in list
    }
