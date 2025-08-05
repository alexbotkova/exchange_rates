const URL = 'http://localhost:8080/?useDb=false';
const code = new URLSearchParams(window.location.search).get('code');

fetch(URL)
    .then(response => {
        return response.json();
    })
    .then(data => {
        const rate = data.find(r => r.shortName === code);
        const container = document.getElementById('detail-container');
        container.innerHTML = `
            <p><strong>shortName:</strong> ${rate.shortName}</p>
            <p><strong>validFrom:</strong> ${rate.validFrom}</p>
            <p><strong>name:</strong> ${rate.name}</p>
            <p><strong>country:</strong> ${rate.country}</p>
            <p><strong>move:</strong> ${rate.move}</p>
            <p><strong>amount:</strong> ${rate.amount}</p>
            <p><strong>valBuy:</strong> ${rate.valBuy}</p>
            <p><strong>valSell:</strong> ${rate.valSell}</p>
            <p><strong>valMid:</strong> ${rate.valMid}</p>
            <p><strong>currBuy:</strong> ${rate.currBuy}</p>
            <p><strong>currSell:</strong> ${rate.currSell}</p>
            <p><strong>currMid:</strong> ${rate.currMid}</p>
            <p><strong>version:</strong> ${rate.version}</p>
            <p><strong>cnbMid:</strong> ${rate.cnbMid}</p>
            <p><strong>ecbMid:</strong> ${rate.ecbMid}</p>
        `;
    })
    .catch(error => {
        console.error(error);
    });