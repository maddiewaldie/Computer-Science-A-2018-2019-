# **Array Notes**

## **Single vs Multidimensional Arrays**
* A 1D array has only one demension, whereas a 2d array has 2 demensions. 
    * A 2D array is an array of arrays.

### **Tables (Single & Multidimensional Arrays)**
You can imagine arays as tables. Below, you can see what a single vs a multidimsnsional array looks like.

**Single Dimension Array**
| 5  | 9  | 3  |  0 |  7 |
|----|----|----|----|----|


**Multidimension Array**
|  5  |  9  |  3  |  0  |  7  |
|-----|-----|-----|-----|-----|
|  -4 |  6  |  20 | -7  |  1  |
| 5   |  1  |  1  |  1  |  8  |
|  0  |  -2  | 15 |  6  |  3  |

## **Syntax**

* **Initialize:** 
    * How to initialize a 1D array
        * `Type[] name = new Type[size1];`
    * How to initialize a 2D array
        * `Type[][] name = new Type[size1][size2];`
    * How to initialize a 3D array
        * `Type[][][] name = new Type[size1][size2][size3];`
* **Accessing:**
    * How to access an element at a position for a 1D array
        * `name[element1];`
    * How to access an element at a position for a 2D array
        * `name[element1][element2];`
* **Length:**
    * How to access the length of a 1D array
        * `name.length();`
    * How to access the length of a 2D array
        * To find row length: `name.length();`
        * To find column length: `name[0].length();`