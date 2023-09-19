function existeFecha(fecha){
    var fechaf = fecha.split("/");
    var day = fechaf[0];
    var month = fechaf[1];
    var year = fechaf[2];
    var date = new Date(year,month,'0');
    if((day-0)>(date.getDate()-0)){
          return false;
    }
    return true;
}

function existeFecha2 (fecha) {
      var fechaf = fecha.split("/");
      var d = fechaf[0];
      var m = fechaf[1];
      var y = fechaf[2];
      return m > 0 && m < 13 && y > 0 && y < 32768 && d > 0 && d <= (new Date(y, m, 0)).getDate();
}

