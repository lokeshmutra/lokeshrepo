$(document).ready(function () {
  loadData();
});

function loadData(){

 $.ajax({url: "/dataproviders", success: function(response){
     console.log(response);
    $('#columns').columns({
          paginating :false,
          data: response,
           schema: [
                            {"header":"Provider Name", "key":"name"},
                            {"header":"Price", "key":"lowest_price"},
                            {"header":"Rating", "key":"rating"},
                            {"header":"Speed (Mbps)", "key":"max_speed"},
                            {"header":"Description", "key":"description"},
                            {"header":"Contact Number", "key":"contact_no"},
                            {"header":"Email", "key":"email"}
                    ]
      });

  }});



  }

