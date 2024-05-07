# Counter
[![](https://jitpack.io/v/rahulsharma860/counter.svg)](https://jitpack.io/#rahulsharma860/counter)

Easiest counter library with callbacks.
## Demo

 ![](https://github.com/rahulsharma860/Counter/blob/master/images/1.png)

 ![](https://github.com/rahulsharma860/Counter/blob/master/images/2.png)

## Dependency
### Jitpack Link
https://jitpack.io/#rahulsharma860/counter/1.0.0

Add it in your root build.gradle at the end of repositories:

Step 1. Add the JitPack repository to your build file
```
dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}
	}
```

Step 2. Add the dependency
```
dependencies {
	        implementation 'com.github.rahulsharma860:counter:x.x.x'
	}
```

### Example

Step 1. Add the tag to the layout file
```
    <com.rahul.counter.Counter
        android:id="@+id/counter"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />

```

Step 2. Find the tag in the Activity or Fragment
```
 var counter=findViewById<Counter>(R.id.counter)
```
Step 3. Add the callbacks to get the value
```
counter.setValueChangeListener(object:ValueChangeListener{
            override fun onValueIncremented(value: String) {
                Toast.makeText(applicationContext, "${value}", Toast.LENGTH_SHORT).show()
            }

            override fun onValueDecremented(value: String) {
                Toast.makeText(applicationContext, "${value}", Toast.LENGTH_SHORT).show()
            }

            override fun onValueChanged(value: String) {
                 
            }

        })
```

**Enjoy...**
