import React from 'react'

const Tailwind = () => {
  return (
    <div className="flex gap-10 flex-col justify-center items-center bg-gray-800 min-h-screen text-white">
      <h1 className="uppercase text-5xl font-bold hover:text-purple-600  transition">
        Profile Card
      </h1>

      <div className=" w-3/5 p-5 rounded-2xl  bg-gray-700  shadow-lg flex flex-col gap-10 justify-center items-center ">
        <img
        className='w-42 rounded-full hover:scale-110 transition '
          src="https://media.easy-peasy.ai/4e600a82-8aac-4abb-95cd-f87cc9125a0f/18ea5802-d34e-4fbb-91e2-99baebb2eac9_medium.webp"
          alt=""
        />

        <div className='text-center'>
            <h1  className='text-xl font-bold '>James</h1>
            <button className='text-xl  border-none bg-blue-800 p-2 mt-10 rounded-xl font-semibold  round'>Contact me</button>
        </div>

      </div>
    </div>
  );
}

export default Tailwind
