// let id = prompt("Give me a value between 1-100");
// getData(id);
function getOneUser(id){
    let newID = parseInt(id);
fetch('http://localhost:9092/user/read/'+ newID)
  .then(
    function(response) {
      if (response.status !== 200) {
        console.log('Looks like there was a problem. Status Code: ' +
          response.status);
        return;
      }

      // Examine the text in the response
      response.json().then(function(data) {
        console.log(data);
      
        // let p = document.createElement("p");
        // p.innerHTML = data[0].id + "\n Name: "+ data[0].name + "\n Age: "+data[0].age +"\n ToDos: "+ data[0].toDos;
        // document.body.appendChild(p);
       

      });
    }
  )
  .catch(function(err) {
    console.log('Fetch Error :-S', err);
  });
}
// function createTableHead(table,data2){
//     // let tableHead = table.createTHead();
//     // let row = tableHead.insertRow();
//     for(let val of data2){
//         let th = document.createElement("th");
//         let text = document.createTextNode(val);
//         th.appendChild(text);
//         // row.appendChild(th);
//     }
// }

// function createTableBody (table,data){
//     // for(let record of data){
//         let row = table.insertRow();
//         for(let prop in data){
//             let cell = row.insertCell();
//             let text = document.createTextNode(data[prop])
//             cell.appendChild(text);
//         }
//     }


