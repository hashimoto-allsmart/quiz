let client = null;

function connect() {
  const socket = new SockJS('/endpoint');
  client = Stomp.over(socket);
  client.connect({}, (frame) => {
    // 応答を監視
    client.subscribe('/result', (result) => {
      $('.result').text(JSON.parse(result.body).teamName);
    });
  });

}

function press() {
  const id = '1';
  const name = 'チームA';
  client.send('/app/answer', {}, JSON.stringify({'id': id, 'name': name}));
}

$(() => {
  // 接続
  connect();
  $(document).on('mousedown', '.switch a', (event) => {
    $(event.target).addClass('active');
  })
  $(document).on('mouseup', '.switch a', (event) => {
    $(event.target).removeClass('active');
    press();
  })
});