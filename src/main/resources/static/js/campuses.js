const app = document.querySelector('#app');

fetch('/campuses')
	.then(response => response.json())
	.then(campuses =>{
	console.log(campuses);
	
	// campuses._embedded.campuses.forEach(campus =>{
	campuses.forEach(campus => {
	// console.log(campus.name);
	// console.log(campus.bootcamps);
	const nameElement = document.createElement('h2');
	nameElement.innerHTML = campus.name;
	app.appendChild(nameElement);
	
	const bootcamps = campus.bootcamps;
	
	const bootcampUlElem = document.createElement('ul');
	app.appendChild(bootcampUlElem);
	
	bootcamps.forEach(bootcamp => {
		const bootcampListElem = document.createElement('li');
		bootcampListElem.innerHTML = bootcamp.name;
		bootcampUlElem.appendChild(bootcampListElem);
		})
	
	
	})
	
})
	
.catch(err => console.log(err));