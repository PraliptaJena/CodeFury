function phonenumber(inputtxt) {
		console.log(inputtxt)
		var phoneno = /^\d{10}$/;
		if (inputtxt.value.match(phoneno)) {
			return true;
		} else {
			alert("Not a valid Phone Number");
			return false;
		}
	};

	function doValidate() {
		// event.preventDefault()
		//    return (ValidateEmail(document.form1.email) && phonenumber(document.form1.phone))
		var res = document.getElementById("birthday").value;
		//   console.log(res,typeof(res));
		//  var p=res.split("-");
		//  var birthyear=parseInt(p[0]);
		//  console.log(birthyear);
		//  var todaysdate=new Date();
		//  console.log(todaysdate);
		var bday = new Date(res)
		var today = new Date()
		age = (today - bday) / (60 * 60 * 24 * 365 * 1000)
		var con = true
		if (age < 18) {
			alert("age should be greater than 18")
			con = false
		}
		return fileValidation() && ValidateEmail(document.form1.email)
				&& phonenumber(document.form1.phone) && con
		// console.log(document.form1.phone)
		// return false
	}

	function ValidateEmail(mail) {
		// console.log("mail",mail)
		if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(mail.value)) {
			// console.log("here")
			return (true)
		}
		alert("You have entered an invalid email address!")
		return (false)
	}

	function fileValidation() {
		var fileInput = document.getElementById('file');
		var filePath = fileInput.value;
		var allowedExtensions = /(\.jpg|\.jpeg|\.png|\.gif)$/i;
		if (!allowedExtensions.exec(filePath)) {
			alert('Please upload file having extensions .jpeg/.jpg/.png/.gif only.');
			fileInput.value = '';
			return false;
		} else {
			//Image preview
			if (fileInput.files && fileInput.files[0]) {
				var reader = new FileReader();
				""
				reader.onload = function(e) {
					//document.getElementById('imagePreview').innerHTML = '<img id="impreview" src="'+e.target.result+'"/>';
				};
				reader.readAsDataURL(fileInput.files[0]);
			}
		}
	}
