const URL = 'http://localhost:8080/?useDb=false';

fetch(URL)
    .then(response => {
        return response.json();
    })
    .then(data => {
        const container = document.getElementById('rates-container');
        data.forEach(rate => {
            const p = document.createElement('p');
            const link = document.createElement('a');
            link.href = `detail.html?code=${rate.shortName}`;
            link.textContent = rate.shortName;
            p.appendChild(link);
            container.appendChild(p);
        });
    })
    .catch(error => {
        console.error(error);
    });
