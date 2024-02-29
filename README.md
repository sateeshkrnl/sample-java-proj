# Sorting Algorithms

## Selection Sort

```
int[] arr = new int[]{};
for(int i=0;i<arr.length-1;i++){
  int min_idx=i;
  for(int j=i+1;j<arr.length-(i+1);j++){
    if(arr[i]>arr[j]){
      min_idx=j;
    }
  }
  int temp=arr[min_idx];
  arr[min_idx]=arr[i];
  arr[i]=temp;
}

Time Complexity: O(n2)
No of Comparisions: n(n+1)/2
```