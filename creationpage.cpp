#include <iostream>
#include <string>

//public class landingpage extends (something) implements OnClickListener
{
  //code for textbox saying "Pick your pet!"
  //creating button objects
  private Button dogbutton;
  private Button catbutton;
  private Button pigbutton;
  
  @Override
  
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
    
    //connect buttons to xml screen
    dogbutton = (Button) findViewbyId(R.id.//dog name in xml here)
    catbutton = (Button) findViewbyId(R.id.//cat name in xml here)
    pigbutton = (Button) findViewbyId(R.id.//pig name in xml here)
    
    dogbutton.setOnClickListener(this);
    catbutton.setOnClickListener(this);
    pigbutton.setOnClickListener(this);
    
  }
  
  @Override
  
    public void onClick(View v)
  {
    switch(v.getId())
    {
      case R.id.dog
      {
        animal dog;
        break;
      }
      case R.id.cat
      {
        animal cat;
        break;
      }
      case R.id.pig
      {
        animal pig
        break;
      }
    }
  }
  
  
  //code to move on to set name page
  
};