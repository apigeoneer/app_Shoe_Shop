# Shoe Shop App

## GIF
<img src="https://user-images.githubusercontent.com/43718257/121768675-07f85d80-cb7d-11eb-89f8-ab33d2eb377e.gif" width=240 height=460>

## About

This app implements Single Activity architecture. It has 2 scren, namely the mai screen & the detail screen.
* Main screen
  - This is a list screen which uses ScrollView and LinearLayout for showing a list of items and one Floating Action button for going to the detail screen.
  - When there are no shoe items in the list , this screen prompts the user to add one, through a text in th eblank screen
  - It has a floating action button (fab) to take the user to the detail screen.
  - This screen also has a Logout menu to return to the Login screen.
  - 
* Detail screen
  - When a user taps on the floating action button on the main screen, s(he) is taken to the detai screen in order to fill out the shoe details. This scren shows two columns of labels and edit views to enter in a new item.
 
 
* Databinding has been applied in layouts to show the correct data to users in multiple layouts. It is also used for click listeners on a navigation screen in the app. The app makes use of the <data> and <variable> elements within the detail layout.
  

* [Jetpack components](https://developer.android.com/jetpack/getting-started)
  - Uses compenents such as ViewModel and LiveData lifecycle classes
  - Navigation : through a navigation file that takes a user from one page to the next in the app
