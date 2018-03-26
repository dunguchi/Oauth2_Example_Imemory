# TrainingReact

	Step 1: Import and install project

			A --->  Import project to your eclipse. import maven project.
			B ---> Maven install.
			
	Step 2: Run project ( You should use spring tool suite)
	
	Step 3: Oauth 
			Using PostMan
			
			Http 			--> 	localhost:8082/oauth/token
			Method 			-->		Post
			Basic Auth 		--> 	Username: my-trusted-client, Password: secret
			Form Request 	--> 	Form-Data
			Variable 		-->		username=admin, password=12345678, grant_type=password
			
			