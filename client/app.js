// Create WebSocket connection.
const socket = new WebSocket('ws://192.168.1.10:8080/garage');

// Connection opened
socket.addEventListener('open', function () {
    console.log('Connected to server ');
});

// Listen for messages
socket.addEventListener('message', function (event) {
    console.log('Message from server ', event.data);
    let object=JSON.parse(event.data);
    document.querySelector("#carCount").innerHTML="the cars count is: " +object.carCount;
    document.querySelector("#message").innerHTML=object.infoMessage;
});
